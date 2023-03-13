package lesson_03.classTasks;

import java.util.Scanner;
public class ClockTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter time (hours and minutes)");
        int time = input.nextInt();



        System.out.print((time / 100) + " : ");
        System.out.print((time % 100));






    }
}
