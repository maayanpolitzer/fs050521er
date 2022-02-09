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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {

    private String username;
    private TextArea chatView;
    private static DateFormat sdf = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField usernameInput = new TextField();
        Button myButton = new Button("Enter the chat");
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                username = usernameInput.getText().trim();
                if(!username.isEmpty()) {
                    window.setScene(getChatScreen());
                    startGettingMessages();
                }
            }
        });
        VBox mainLayout = new VBox(usernameInput, myButton);
        Scene mainScreen = new Scene(mainLayout);
        window.setScene(mainScreen);

        window.setTitle("wow this is amazing!");
        window.show();
    }

    private void startGettingMessages(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    try {
                        Thread.sleep(10000);
                        String content = "Virtual: new message in for loop " + i;
                        displayMessage(content);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            }
        }).start();

    }

    private void displayMessage(String message){
        String time = sdf.format(new Date());
        chatView.appendText(message + "  (" + time + ")" + "\n");
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
                displayMessage(username + ": " + text);
                input.clear();
            }
        });
        sendBtn.setPrefSize(100, 100);
        HBox inputView = new HBox(input, sendBtn);
        VBox mainLayout = new VBox(chatView, inputView);
        return new Scene(mainLayout);
    }

}
