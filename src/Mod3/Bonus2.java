package Mod3;

import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        while (password.length() < 8 || password.length() > 15) {
            System.out.println("The password must be 8 to 15 symbols long! Try again.");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }
        System.out.println("You've entered: ");
        System.out.println("Username - " + username + "; password - " + password);
    }
}
