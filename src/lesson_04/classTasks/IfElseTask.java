package lesson_04.classTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("the number " + number + " is even!");
        } else {
            System.out.println("the number " + number + " is odd!");
        }
    }
}
