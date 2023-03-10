package lesson_01;

public class Variables {
    public static void main(String[] args) { //psvn

        byte myByte = 25;
        short myShort;
        myShort = 345;
        int myInt = 661_237_896;
        long myLong = 2_465_487_546_216_549_854L;
        float myFloat = 32.5F;
        double myDouble = 2323.54562;
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;
        char myChar = 'a';
        char myChar1 = '7';
        char myChar2 = '€';

        System.out.println("myByte = " + myByte);  //identifier.soutv
        System.out.println(myByte); //identifier.sout
        System.out.println("myShort = " + myShort);
        myShort = 1000;
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myBooleanTrue = " + myBooleanTrue);
        System.out.println("myBooleanFalse = " + myBooleanFalse);
        System.out.println("myChar = " + myChar);
        System.out.println("myChar1 = " + myChar1);
        System.out.println("myChar2 = " + myChar2);

        // the long way of writing String
        String myName = "Dan";

        System.out.println("myName = " + myName);

        // the short way of writing String
        String lastName = "Ruckban";

        System.out.println("lastName = " + lastName);


    }
}
