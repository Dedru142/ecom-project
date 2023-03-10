package lesson_02;

import java.util.Scanner;

public class ScannerWork {
    public static void main(String[] args) {

        //  type name - value
        int age = 100;

        // Type name = new Type(...)
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String myName = input.nextLine();

        System.out.println("What is your age? ");
        int myAge = input.nextInt();

        System.out.println("what is your average grade?");
        double myAverage = input.nextDouble();

        System.out.println("myAge = " + myAge);
        System.out.println("myName = " + myName);
        System.out.println("myAverage = " + myAverage);
    }
}
