package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    TextField t1 = null;
    TextField t2 = null;

    // method definition:
    public static void sendSMS(String phoneNumber, String message){
        System.out.println(phoneNumber);
        System.out.println(message);
    }

    public static void main(String[] args) {
	    launch(null);
    }

    public void sendButtonClicked () {
        System.out.println("button was clicked");
        String firstText = t1.getText();
        String secondText = t2.getText();
        sendSMS(firstText, secondText);
    }

    @Override
    public void start (Stage primaryStage) throws Exception {
        System.out.println("start");
        t1 = new TextField();

        t2 = new TextField();
        Button sendBtn = new Button("send");
        sendBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sendButtonClicked();
            }
        });


        VBox vbox = new VBox(t1, t2, sendBtn);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
