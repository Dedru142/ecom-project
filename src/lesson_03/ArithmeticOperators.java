package lesson_03;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        double c = 20;
        double d = 6;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(3 + " ** " + 4 + " = " + (Math.pow(3, 4)));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(18 + " % " + b + " = " + (18 % b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println(c + " / " + 0 + " = " + (c % 0));
        System.out.println(a + " / " + 0 + " = " + (a % 0));
    }
}
