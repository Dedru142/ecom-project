package lesson_06.scope;

public class ScopeClassWork {
    public static void main(String[] args) {


        // Global Scope
        int summary = 0;

        for (int i = 1; i <=10; i++){
            summary += i;
            int age = i;
            System.out.println("age = " + age);
        }

        System.out.println("summary = " + summary);
//        System.out.println("age = " + age);


    }
//        System.out.println("summary = " + summary);
}
