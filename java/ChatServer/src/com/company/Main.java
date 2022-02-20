package com.company;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> chatMessages = new ArrayList<>();

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(Consts.SERVER_PORT);
            while(true){
                System.out.println("waiting....");
                Socket client = serverSocket.accept();  // blocking method!
                System.out.println("client connected");
                new ClientThread(client).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
