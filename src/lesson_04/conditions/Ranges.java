package lesson_04.conditions;

import java.util.Scanner;

public class Ranges {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 - 50");

        int number = scanner.nextInt();

        if (number > 0 && number <=20) {
            System.out.println("The number " + number + " in the range of 1-20");
        } else if (number > 20 && number <= 30) {
            System.out.println("The number " + number + " in range of 21 - 30");
        } else if (number > 30 && number <=50) {
            System.out.println("The number " + number + " in the range of 31 - 50");
        }
        else {
            System.out.println( "The number " + number + " is not valid");
        }
    }
}
