package lesson_03;

public class AssignmentOperators {
    public static void main(String[] args) {

        int a = 30;
        System.out.println("a = " + a);

        a = 50;
        System.out.println("a = " + a);

        a = a + 5;
        System.out.println("a = " + a);

        // a = a + 5;
        a += 5;
        System.out.println("a = " + a);

        // a = a 0 10;
        a -= 10;
        System.out.println("a = " + a);

        // a = a * 2;
        a *= 2;
        System.out.println("a = " + a);

        // a = a / 4;
        a /= 4;
        System.out.println("a = " + a);

        // a = a % 10;
        a %= 10;
        System.out.println("a = " + a);
    }
}
