package org.example;

import java.sql.*;

public class Main {

    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/whatsapp";
    private static final String MYSQL_USERNAME = "javaUser";
    private static final String MYSQL_PASSWORD = "qwerty123";

    public static void main(String[] args) {

//        Person p1 = new Person();
//        System.out.println(p1.getAddress().getStreet());
        select();
    }

    private static void select(){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
//            String query = "SELECT * FROM `users` ORDER BY created_at DESC;";
            /*
            int recordPerPage = 2;
            int page = 1;
            String query = "SELECT id, email, created_at FROM `users` LIMIT " + recordPerPage + " OFFSET " + (page - 1) * recordPerPage + ";";
             */
            String query = "SELECT * FROM `users`;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int rowId = resultSet.getInt("id");
                String email = resultSet.getString("email");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                System.out.println(rowId + ": " + email + ", " + createdAt);
                /*
                String password = resultSet.getString("password");
                String phone = resultSet.getString("phone");
                String name = resultSet.getString("name");
                String about = resultSet.getString("about");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                System.out.println(rowId + ": " + email + ", " + password + "," + phone + ", " + name + ", " + about + ", " + createdAt);
                 */
            }
            connection.close();
        }catch(Exception e){
            System.out.println("sql error");
        }
    }

    // AS
    // COUNT



}
