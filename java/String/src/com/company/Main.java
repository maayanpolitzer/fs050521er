package com.company;

public class Main {

    public static void main(String[] args) {
        // String is immutable: (לא ניתן לשינוי!)
        String empty = null;    // empty not points to anywhere.

	    String s = "Hello, World!";

        /*
        byte[] b = s.getBytes();    // using the ascii table.
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        */

        // כל מתודה של האובייקט מהמחלקה סטרינג תחזיר אובייקט חדש
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("WO"));
        System.out.println(s.indexOf("o"));
        System.out.println(s.charAt(8));
        System.out.println(s);

        // web scraping (libraries):
        // python (beautiful soup)
        // java (jsoup)
        String data = "<html><head></head><body><p>Maayan Politzer</p></body></html>";
        int start = data.indexOf("<p>") + 3;
        int end = data.indexOf("</p>");
        System.out.println(data.substring(start, end));


        int a1 = 54;
        int temp1 = 20;
        int temp2 = 34;
        int a2 = temp1 + temp2;
        System.out.println(a1 == a2);

        String s1 = "Maayan";

        String t1 = "Maaya";
        String t2 = "n";

        String s2 = t1 + t2;

        System.out.println(s1 == s2);   // checks pointers. (is it in the same place in the RAM? / is it the same object?);
        System.out.println("******");
        System.out.println(s1.equals(s2));  // checks the characters inside the string.

        Person p1 = new Person("Avi", "Levi");
        Person p2 = new Person("Avi", "Levi");

        System.out.println("*****");
        System.out.println(p1 == p2);   // checks pointers.
        System.out.println(p1.equals(p2));

    }
}
