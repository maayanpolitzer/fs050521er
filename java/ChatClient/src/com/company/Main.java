package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main extends Application {

    private String username;
    private TextArea chatView;
    private int messagesCount = 0;
    //private static DateFormat sdf = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage frame) throws Exception {
        TextField usernameInput = new TextField();
        Button myButton = new Button("Enter the chat");
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                username = usernameInput.getText().trim();
                if(!username.isEmpty()) {
                    frame.setScene(getChatScreen());
                    startGettingMessages();
                }
            }
        });
        VBox mainLayout = new VBox(usernameInput, myButton);
        Scene mainScreen = new Scene(mainLayout);
        frame.setScene(mainScreen);

        frame.setTitle("wow this is amazing!");
        frame.show();
    }

    private void startGettingMessages(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    getMessageFromServer();
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                /*
                for(int i = 0; i < 5; i++){
                    try {
                        Thread.sleep(10000);
                        String content = "Virtual: new message in for loop " + i;
                        displayMessage(content);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }

                 */
            }
        }).start();

    }

    private void displayMessage(String message){
        //String time = sdf.format(new Date());
        //chatView.appendText(message + "  (" + time + ")" + "\n");
        chatView.appendText(message + "\n");
    }

    private Scene getChatScreen(){
        chatView = new TextArea();
        chatView.setEditable(false);
        chatView.setPrefSize(500, 400);
        TextField input = new TextField();
        input.setPrefSize(400, 100);
        Button sendBtn = new Button("Send");
        sendBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String text = input.getText();
                //displayMessage(username + ": " + text);
                sendMessageToServer(username + ": " + text);
                input.clear();
            }
        });
        sendBtn.setPrefSize(100, 100);
        HBox inputView = new HBox(input, sendBtn);
        VBox mainLayout = new VBox(chatView, inputView);
        return new Scene(mainLayout);
    }

    private void getMessageFromServer(){
        try {
            Socket server = new Socket("46.116.48.7", 9000); // router => port forwarding.
            OutputStream out = server.getOutputStream();
            out.write(2);   // client wants to read a new message.
            out.write(messagesCount);
            InputStream in = server.getInputStream();
            int messageLength = in.read();
            if(messageLength != 0){
                byte[] messageInBytes = new byte[messageLength];
                in.read(messageInBytes);
                messagesCount++;
                String incomingNewMessage = new String(messageInBytes);
                displayMessage(incomingNewMessage);
            }
            in.close();
            out.close();
        }catch(Exception e){
            System.out.println("Can't get new messages");
        }
    }

    private void sendMessageToServer(String message){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // create tcp connection: (using sockets & bytes)
                    Socket server = new Socket("46.116.48.7", 9000); // router => port forwarding.
                    OutputStream out = server.getOutputStream();
                    out.write(1);   // client wants to send a message.
                    out.write(message.length());
                    out.write(message.getBytes());
                    out.close();
                    System.out.println("message sent successfully");
                }catch(Exception e){
                    System.out.println("Error connecting to server");
                }
            }
        }).start();
    }

}
