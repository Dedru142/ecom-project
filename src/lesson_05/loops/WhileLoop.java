package lesson_05.loops;

public class WhileLoop {
    public static void main(String[] args) {


        String names[] = {"Alex", "Nitzan", "Michal", "Dan", "Moshe"};
        int i = 0;

        while (i < names.length) {
            System.out.println(i + " . " + names[i]);
            i++;
        }

        int j = 0;
        while (j < 20) {
            if(j % 5 == 0) {
                j++;
                continue;
            }

            if (j == 14) {
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}
