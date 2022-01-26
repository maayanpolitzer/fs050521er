package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) {
        /*
        String filename = "maayan2.txt";
        if(createFile(filename)){
            writeToFile(filename, "This is amazing!!!");
        }*/

        //readFromFile("wow.txt");

        //copyFile("wow_encrypt.txt", "lev.txt");

        //addNameToList("List.txt", "Maayan");

    }

    private static void fixedCopyFile(String filename, String newFileName){
        try {
            File f = new File(filename);
            FileInputStream in = new FileInputStream(f);
            FileOutputStream out = new FileOutputStream(newFileName);
            // קוד אחראי שמאפשר העתקת קובץ בלי קשר לגודל הקובץ ובלי תפיסת הרבה מקום בRAM:
            byte[] buffer = new byte[1024];
            int actuallyRead = 0;
            while((actuallyRead = in.read(buffer)) != -1){
                out.write(buffer, 0, actuallyRead);
            }
            in.close();
            out.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void copyFile(String filename, String newFileName) {
        try {
            File f = new File(filename);
            FileInputStream in = new FileInputStream(f);
            byte[] bytes = in.readAllBytes();       // קוד לא אחראי!
            in.close();
            int dotIndex = filename.lastIndexOf("."); // 11
            String copyFile = filename.substring(0, dotIndex) + "_decrypt" + filename.substring(dotIndex); // "wow_encrypt_decrypt.txt"
            FileOutputStream out = new FileOutputStream(newFileName);
            //FileOutputStream out = new FileOutputStream(copyFile);
            out.write(bytes);
            out.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void addNameToList(String fileName, String nameToAdd){
        try {
            FileOutputStream out = new FileOutputStream(fileName, true);
            out.write((nameToAdd).getBytes());
            out.write(10);  // new line
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean createFile(String filename){
        File f = new File(System.currentTimeMillis() + "_1_" + filename);
        try {
            return f.createNewFile();
        }catch(Exception e){
            System.out.println("Crash");
            return false;
        }
    }

    public static void readFromFile(String filename){
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            byte[] allBytes = fileInputStream.readAllBytes();
            String data = new String(allBytes);
            System.out.println(data);
            fileInputStream.close();
        }catch(Exception e){

        }
    }

    public static void writeToFile(String filename, String content){
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(content);
            fw.close();
        }catch(Exception e){

        }
        /*
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            fileOut.write(content.getBytes());
            fileOut.close();
        }catch(Exception e){

        }

         */
    }

    // inside a file there is only byte[].
    /*
    file1.png - paint, photoshop
    file2.doc - word
    file3.maayan - notepad, (any ide...), only maayan software...
     */

}
