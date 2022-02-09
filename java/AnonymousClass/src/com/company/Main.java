package com.company;

public class Main {



    public static void main(String[] args) {
	    //Animal a1 = new Animal();
        Animal a3 = new Dog();
        // מחלקה אנונימית - כלומר, אין לה שם ומיד יצרנו ממנה אובייקט
        // יצרנו מחלקה בלי שם שיורשת מהמחלקה Animal
        Animal a2 = new Animal() {
            @Override
            public void makeSound() {

            }
        };

        X x2 = new X(){

            @Override
            public int sum(int a, int b) {
                return 0;
            }

            @Override
            public void wow() {

            }
        };

    }
}
