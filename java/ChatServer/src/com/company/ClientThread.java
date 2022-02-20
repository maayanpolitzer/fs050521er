package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
            int clientAction = in.read();   // blocking method:     hacker: dos attack - Denial of service. (ping) // ddos - distributed denial of service
            switch(clientAction){
                case Consts.CLIENT_SEND_MESSAGE:
                    int messageLength = in.read();  // blocking method:
                    byte[] buffer = new byte[messageLength];
                    in.read(buffer);    // blocking method:
                    String messageFromClient = new String(buffer, StandardCharsets.UTF_8);
                    Main.chatMessages.add(messageFromClient);
                    break;
                case Consts.CLIENT_WANT_TO_GET_MESSAGE:
                    OutputStream out = client.getOutputStream();
                    int messagesInClientCount = in.read();  // blocking method:
                    if(messagesInClientCount < Main.chatMessages.size()){
                        String messageToSend = Main.chatMessages.get(messagesInClientCount);
                        out.write(messageToSend.length());
                        out.write(messageToSend.getBytes(StandardCharsets.UTF_8));
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
