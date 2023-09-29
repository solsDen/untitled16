package qu.guru;

import java.lang.module.Configuration;

public class heloWorld {
    boolean aBoolean = false;
    char aChar = '&';
    byte aByte = 1;
    short aShort = 1;
    int anInt = 1;
    long aLong = 1;
    float aFloat = 1.0F;
    double aDouble = 1.00;


    public static void main(String[] args) {
        int age = 10;
        String message = "heloWorld";
        Human dima = new Human(5,"Дима");
        Human alex = new Human(4, "Александр");

        dima.age = 32;

        alex.age = 32;
        dima.sayName();
        alex.sayName();
        dima.sayWeight();
        dima.commonName = "Не человек";


        Human.sayClassName();

        dima.incrementAge();
        dima.sayAge();
        alex.sayAge();
        alex.sayWeight();
        System.out.println(message);
    }
}
