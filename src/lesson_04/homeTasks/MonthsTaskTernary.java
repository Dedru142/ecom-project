package lesson_04.homeTasks;

import java.util.Scanner;

public class MonthsTaskTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number (1-12):");
        int month = scanner.nextInt();

        String monthName;
        monthName=month==1?"January":month==2?"February":month==3?"March":month==4?"April":month==5?"May":month==6?"June":month==7?"July":month==8?"August":month==9?"September":month==10?"October":month==11?"November":month==12? "December":"Invalid";
        System.out.println("The Month is " + monthName);
        //for fun
    }
}
