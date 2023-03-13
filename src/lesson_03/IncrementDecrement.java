package lesson_03;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("a = " + a);
        System.out.println("Increments");
//        a = a + 1;
//        a += 1;
//        a++;
        //Increment
        System.out.println("a++ = " + a++); //postfix
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a); //prefix
        System.out.println("a = " + a);

        System.out.println("Decrements:");
//        a = a - 1;
//        a -= 1;
//        a--;
        //Decrement
        System.out.println("a-- = " + a--); //postfix
        System.out.println("a = " + a);
        System.out.println("--a = " + --a); //prefix
        System.out.println("a = " + a);

    }
}
