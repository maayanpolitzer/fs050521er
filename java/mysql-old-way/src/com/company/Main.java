package com.company;

import java.sql.*;
import java.util.Scanner;


public class Main {

//    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/whatsapp";
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/whatsapp";
    private static final String MYSQL_USERNAME = "javaUser";
    private static final String MYSQL_PASSWORD = "qwerty123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //select(4);
        //insert("11111112");
        //update();
        //delete();

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        User loggedInUser = login(email, password);
        System.out.println("Login result:");    // SQL Injection.
        if(loggedInUser == null){
            System.out.println("login failed");
        }else{
            System.out.println(loggedInUser);
        }
        */

        // sql injection:
        selectInjection();

    }

    private static void delete(){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
            String query = "DELETE FROM `users` WHERE `id` >= 5;";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("rows deleted: " + rowsAffected);
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("sql error");
        }
    }

    private static void selectInjection(){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
//            String query = "UPDATE `users` SET `about` = 'very new about' WHERE `id` = 4;";   // by unique key will update max 1 row
            String query = "SELECT * FROM whatsapp.users ;drop table products";
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            //System.out.println("rows updated: " + rowsUpdated);
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("sql error");
        }
    }

    private static void update(){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
//            String query = "UPDATE `users` SET `about` = 'very new about' WHERE `id` = 4;";   // by unique key will update max 1 row
            String query = "UPDATE `users` SET `about` = 'very new about 3', `password` = '123' WHERE `name` = 'Itay Politzer';";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("rows updated: " + rowsAffected);
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("sql error");
        }
    }

    private static void insert(String phone) {
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
            String query = "INSERT INTO `users` (`email`, `password`, `name`, `phone`, `about`) VALUES ('itay@gmail.com', '123456', 'Itay Politzer', '" + phone + "', 'Hi, I am Itay');";
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("rows added: " + rowsAffected);
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("sql error");
        }
    }

    // Authentication:
    private static User login(String loginEmail, String loginPassword){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
            /*
            String query = "SELECT * FROM `users` WHERE email = '" + loginEmail + "' AND password = '" + loginPassword + "';";      // SELECT * FROM `users` WHERE email = 'maayan@gmail.com' AND password = 'asd' OR '1' = '1';
            System.out.println(query);
            Statement statement = connection.createStatement();   // not validating input against SQL Injection.
             */
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `users` WHERE email = ? AND password = ?;");  // validating input against SQL Injection.
            preparedStatement.setString(1, loginEmail);
            preparedStatement.setString(2, loginPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            while(resultSet.next()){
                int rowId = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String phone = resultSet.getString("phone");
                String name = resultSet.getString("name");
                String about = resultSet.getString("about");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                System.out.println(rowId + ": " + email + ", " + password + "," + phone + ", " + name + ", " + about + ", " + createdAt);
                user = new User(rowId, email, phone, name, about);
            }
            connection.close();
            return user;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("sql error");
        }
        return null;
    }

    private static void select(int id){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
            String query = "SELECT * FROM `users` WHERE id = " + id + ";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int rowId = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String phone = resultSet.getString("phone");
                String name = resultSet.getString("name");
                String about = resultSet.getString("about");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                System.out.println(rowId + ": " + email + ", " + password + "," + phone + ", " + name + ", " + about + ", " + createdAt);
            }
            connection.close();
        }catch(Exception e){
            System.out.println("sql error");
        }
    }
}
