package lesson_04.homeTasks;

import java.util.Scanner;

public class CredentialsTaskIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String savedUsername = "Name";
        String savedPassword = "Password";

        System.out.println("please enter username: ");
        String username = scanner.nextLine();
        System.out.println("please enter password: ");
        String password = scanner.nextLine();

        if ((savedUsername.equals(username)) && (savedPassword.equals(password))) {
            System.out.println("Welcome " + username);
        } else
            System.out.println("account not found");

    }
}
