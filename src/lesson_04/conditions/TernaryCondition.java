package lesson_04.conditions;

public class TernaryCondition {
    public static void main(String[] args) {

        String result;
        int a = 5,b = 5;
        int c = 6;

        result = (a == b) ? "a and b are equal" : "a and b are not equal";


        System.out.println("result = " + result);

       /* if (a == c) {
            result = "a and c are equal";
        }
        else {
            result = "a and c are not equal";
        }

        */

        result = (a == c) ? "a and c are equal" : "a and c are not equal";

        System.out.println("result = " + result);

        int age = 18;

        result = (age > 18) ? "you're an adult" : (age == 18) ? "you're 18!" : "you're a kid!";
        System.out.println("result = " + result);
    }
}
