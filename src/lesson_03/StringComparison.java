package lesson_03;

public class StringComparison {
    public static void main(String[] args) {

        String username = "Dan";
        String actualUsername = "Dan";

        System.out.println("username == actualUsername -> " + (username == actualUsername));

        System.out.println("a" == "a");

        String expectedName = new String("Dan");
        System.out.println("actualUsername == expectedUsername -> " + (actualUsername == expectedName));

        System.out.println("username.equals(actualUsername) = " + username.equals(actualUsername));
        System.out.println("username.equals(expectedName) = " + username.equals(expectedName));
        System.out.println("expectedName.equals(\"daN\") = " + expectedName.equals("daN"));
        System.out.println("username.equalsIgnoreCase(\"daN\") = " + username.equalsIgnoreCase("daN"));

    }
}
