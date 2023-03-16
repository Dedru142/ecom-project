package lesson_04.homeTasks;

import java.util.Scanner;

public class CredentialsTaskTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String login;
        String savedUsername = "Name";
        String savedPassword = "Password";

        System.out.println("please enter username: ");
        String username = scanner.nextLine();
        System.out.println("please enter password: ");
        String password = scanner.nextLine();

        login = ((savedUsername.equals(username)) && (savedPassword.equals(password))) ? "Welcome user " + username : "account not found" ;

        System.out.println(login);
    }
}
