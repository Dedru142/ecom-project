package lesson_06.methods;

import java.util.Date;

public class MethodsClassWork {
    public static void main(String[] args) {

        sayHello();
        sayHelloWithName("Dan");

        String myName = "Moshe";
        sayHelloWithName(myName);

        int summary = sum(4,5);
        System.out.println("summary = " + summary);

        System.out.println("getRandomNumber() = " + getRandomNumber());

        long randomNumber = getRandomNumber();
        if (randomNumber==122342342423423432L){
            System.out.println("randomNumber = " + randomNumber);
        }
    }

    public static void sayHello() { // no receive, no return
        System.out.println("Good Evening das!");
    }

    public static void sayHelloWithName(String name) { // do receive, no return
        System.out.println("Good Evening " + name + "!");
    }

    public static long getRandomNumber() { // no receive, do return
        Date date = new Date();
        long randomNumber = date.getTime();
        System.out.println("Printing from the method getRandomNumber");
        return randomNumber;
    }

    public static int sum(int a, int b) { // do receive, do return
        return a + b;
    }
}
