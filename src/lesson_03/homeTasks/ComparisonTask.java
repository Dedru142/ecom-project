package lesson_03.homeTasks;

public class ComparisonTask {
    public static void main(String[] args) {

        System.out.println(10 + " > " + 6 + " " + (10>6));
        System.out.println(5 + " >= " + 5 + " " +  (5>=5));
        System.out.println(20 + " < " + 10 + " " +  (20<10));
        System.out.println(35 + " <= " + 50 + " " +  (35<=50));
        System.out.println(25 + " == " + 25 + " " +  (25==25));
        System.out.println(50 + " != " + 50 + " " +  (50!=50));
        System.out.println("City" + " == " + "City" + " " +  ("City"=="City"));
        System.out.println("citY" + " == " + "City" + " " +  ("citY".equalsIgnoreCase("City")));

    }
}
