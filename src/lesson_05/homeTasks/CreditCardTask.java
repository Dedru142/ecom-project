package lesson_05.homeTasks;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int savedCard = 12345678;
        String savedPassword = "Password";

        int i = 5;
        while (i > 0) {
            System.out.println("Please enter card number: ");
            int card = scanner.nextInt();
            scanner.nextLine(); // new scanner line(?)

            System.out.println("Please enter password: ");
            String password = scanner.nextLine();

            if ((savedCard==card) && savedPassword.equals(password)){
                System.out.println("Welcome");
                break;
            }
            i--;
            System.out.println(i + " attempts left");
            if (i == 0){
                System.out.println("Card blocked");
                break;
            }
        }
    }
}
