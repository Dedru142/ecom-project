package lesson_05.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfStrings {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Alex");
        list.add("Michal");
        list.add("Nitzan");
        list.add("Dan");
        list.add("Ladislav");

        System.out.println("list.size() = " + list.size());
        System.out.println("list.indexOf(\"Nitzan\") = " + list.indexOf("Nitzan"));
        System.out.println("list.indexOf(\"BLABLA\") = " + list.indexOf("BLABLA"));
        System.out.println("list.contains(\"Michal\") = " + list.contains("Michal"));
        System.out.println("list.contains(\"Moshe\") = " + list.contains("Moshe"));

        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove("Nitzan");
        System.out.println("list = " + list);
        list.remove("123123");
        System.out.println("list = " + list);

        System.out.println("list = " + list);
    }
}
