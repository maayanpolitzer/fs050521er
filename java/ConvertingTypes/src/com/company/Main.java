package com.company;

public class Main {

    public static void main(String[] args) {
        /*
	    // primitive data types:
	    // binary (true/false):
        boolean

        // integers:
        byte    (1 byte)    (-128) - 127
        short
        int     (4 bytes)   (-2147000000) - (2147000000)
        long

        // floating point numbers:
        float   (4 bytes)
        double  (8 bytes)

        // characters:
        char (2bytes)
         */

        // call getInt():
        int x = getInt();
        //send the returned data to sendByte():

        // down casting: (לקחת משתנה בגודל מסויים ולהפוך אותו למשתנה קטן יותר)
        // יש סיכון לאיבוד מידע!
        // אם יש סכנה לאיבוד מידע, הקומפיילר רוצה לוודא שהמתכנת יודע את זה.
        byte v = (byte) x;
        //sendByte(v);

        // up casting: (לקחת משתנה בגודל מסויים ולהפוך אותו למשתנה גדול יותר)
        // אין שום סיכוי לאיבוד מידע
        // ולכן הקומפיילר לא מציג שגיאה
        short s = 4;
        int w = s;

        float f = 4.0f;
        double a = f;

        double k = 4.0;
        float e = (float) k;

        byte firstNumber = 100;
        byte secondNumber = 30;

        byte sum = (byte) (firstNumber + secondNumber);
        System.out.println(sum);

    }

    private static int getInt(){
        return 45300;
    }

    private static void sendByte(byte number){
        System.out.println(number);
    }

}
