package lesson_06.classTasks;

import java.util.ArrayList;

public class FunctionsTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        printArray(numbers);
        System.out.println("\narrayMax(numbers) = " + arrayMax(numbers));

    }
    public static void printArray (ArrayList<Integer> arrayList) {

        arrayList.forEach((number) -> System.out.print(number + " "));
    }
    public static int arrayMax (ArrayList<Integer> arrayList) {

        int maxNumber = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++){
            if (maxNumber > arrayList.get(i)) {
                maxNumber = maxNumber;
            }
            else maxNumber = arrayList.get(i);
        }
        return maxNumber;
    }

}
