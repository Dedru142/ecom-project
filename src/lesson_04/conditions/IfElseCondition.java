package lesson_04.conditions;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scanner.nextInt();
        //int age = 18;

        if (age >18) {
            System.out.println("you're an adult!");
        } else if (age == 18) {
            System.out.println("you are 18 years old!");
        } else {
            System.out.println("you're a kid");

        }
    }
}
