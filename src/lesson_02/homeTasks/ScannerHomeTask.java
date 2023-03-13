package lesson_02.homeTasks;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your firstname?");
        String myFirstName = input.nextLine();

        System.out.println("What is your lastname?");
        String myLastName = input.nextLine();

        System.out.println("Where is your hometown?");
        String myHometown = input.nextLine();

        System.out.println("What is your grades average?");
        double myAverage = input.nextDouble();

        System.out.println("What is your age?");
        int myAge = input.nextInt();

        System.out.println("myFirstName = " + myFirstName);
        System.out.println("myLastName = " + myLastName);
        System.out.println("myHometown = " + myHometown);
        System.out.println("myAverage = " + myAverage);
        System.out.println("myAge = " + myAge);
    }
}
