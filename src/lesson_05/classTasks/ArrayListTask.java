package lesson_05.classTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        double summary = 0;
        System.out.println("Please enter the first number");
        arrayList.add(scanner.nextInt());
        summary += arrayList.get(0);
        System.out.println("Please enter the second number");
        arrayList.add(scanner.nextInt());
        summary += arrayList.get(1);
        System.out.println("Please enter the third number");
        arrayList.add(scanner.nextInt());
        summary += arrayList.get(2);

        int biggestNumber = (arrayList.get(0) > arrayList.get(1) ) ? arrayList.get(0) : arrayList.get(1);

        biggestNumber = (biggestNumber > arrayList.get(2)) ? biggestNumber : arrayList.get(2);

        System.out.println("Biggest Number = " + biggestNumber);
        System.out.println("summary = " + summary);
        System.out.println("Average (summary / 3.0) = " + summary / 3.0);
        System.out.println(arrayList);
    }
}
