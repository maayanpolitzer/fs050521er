package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        boolean fileCreated = createFile("maayan", "txt");
        System.out.println("file created : " + fileCreated);
    }

    public static boolean createFile(String filename, String ext){
        File f = new File(filename + "." + ext);
        try {
            return f.createNewFile();
        }catch(Exception e){
            System.out.println("Crash");
            return false;
        }
    }

    // inside a file there is only byte[].
    /*
    file1.png - paint, photoshop
    file2.doc - word
    file3.maayan - notepad, (any ide...), only maayan software...
     */

}
