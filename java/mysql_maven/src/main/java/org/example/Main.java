package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/msl_new","root","qdx753v6");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from users");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) + " " + rs.getString(4));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
