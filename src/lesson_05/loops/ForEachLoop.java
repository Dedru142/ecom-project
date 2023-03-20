package lesson_05.loops;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Michal");
        names.add("Dan");
        names.add("Ladislav");
        names.add("Nitzan");
        names.add("Moshe");

        System.out.println("========= option1 - for loop ===========");
        for(int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
        System.out.println("========= option2 - for loop ===========");

        int i = 0;
        while (i < names.size()) {
            System.out.print(names.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println("========= option3 - for loop ===========");

        for (String name:names) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("========= option4 - for loop ===========");

        names.forEach((name) -> System.out.print(name + " "));

    }
}
