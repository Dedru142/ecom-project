package lesson_06.homeTasks.catsTasks;

import java.util.ArrayList;

public class MyCats {
    public static void main(String[] args) {


        ArrayList<Cat> catArrayList = new ArrayList<>();

        catArrayList.add(new Cat("Iggy","orange",7));

        catArrayList.add(new Cat("Kirby", "White", 10));

        catArrayList.add(new Cat("Mitch", "Grey", 5));

        catArrayList.add(new Cat("Yoshi", "Green", 20));

        catArrayList.add(new Cat("Nemo", "Orange", 3));

        catList(catArrayList);


    }
    public static void catList(ArrayList<Cat> cat) {
        for (Cat eachCat : cat) {
            System.out.println(eachCat);
        }
    }
}
