package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientThread extends Thread{

    private Socket client;

    public ClientThread(Socket client){
        this.client = client;
    }

    @Override
    public void run(){
        InputStream in = null;
        try{
            in = client.getInputStream();
            int clientAction = in.read();
            switch(clientAction){
                case Consts.CLIENT_SEND_MESSAGE:
                    int messageLength = in.read();
                    byte[] buffer = new byte[messageLength];
                    in.read(buffer);
                    String messageFromClient = new String(buffer);
                    Main.chatMessages.add(messageFromClient);
                    break;
                case Consts.CLIENT_WANT_TO_GET_MESSAGE:
                    OutputStream out = client.getOutputStream();
                    int messagesInClientCount = in.read();
                    if(messagesInClientCount < Main.chatMessages.size()){
                        String messageToSend = Main.chatMessages.get(messagesInClientCount);
                        out.write(messageToSend.length());
                        out.write(messageToSend.getBytes());
                    }else{
                        out.write(0);
                    }
                    out.close();
                    break;
                default:

            }
        }catch(Exception e){

        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
