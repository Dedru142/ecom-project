package lesson_05.homeTasks;

import java.util.ArrayList;

public class CountriesTask {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Venezuela");
        countries.add("Mexico");
        countries.add("Papua New Guinea");
        countries.add("Libya");
        countries.add("Liechtenstein");
        countries.add("Timor-Leste");
        countries.add("Tajikistan");
        countries.add("Malta");
        countries.add("Tuvalu");
        countries.add("Cabo Verde");

        System.out.println("============= For-Each =============");
        for (String country:countries) {
            System.out.println(country);
        }

        System.out.println();
        System.out.println("============= forEach =============");
        countries.forEach((country) -> System.out.println(country));
            }
}
