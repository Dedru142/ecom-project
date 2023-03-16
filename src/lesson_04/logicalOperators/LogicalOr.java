package lesson_04.logicalOperators;

public class LogicalOr {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a + " || " + b + " = " + (a || b));
        System.out.println(a + " || " + c + " = " + (a || c));
        System.out.println(c + " || " + a + " = " + (c || a));
        System.out.println(c + " || " + d + " = " + (c || d));


        System.out.println((5>0) + " || " + (6==6) + " = " + ((5>0) || (6==6)));
        System.out.println((5<0) + " || " + (6==6) + " = " + ((5<0) || (6==6)));
        System.out.println((5>0) + " || " + (6==6) + " || " + (6!=6) +  " = " + ((5>0)||(6==6)||(6!=6)));
        System.out.println((5<0) + " || " + (6!=6) + " || " + (6==6) +  " = " + ((5<0)||(6!=6)||(6==6)));

    }
}
