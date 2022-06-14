package lesson_06;

import java.util.Scanner;

public class Lab_0602 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myPassword = "password123";
        String inputPassword;
        int count = 1;
        System.out.println(" Input your password: ");

        do {
            inputPassword = scanner.nextLine();

            if (myPassword.equals(inputPassword)) {
                System.out.println(" Correct password!");
                break;
            } else {

                if ((3 - count) >= 1) {
                    System.out.printf(" Wrong password! You have %d time(s) left to re-enter.", (3 - count));
                    System.out.println("\n Please try it again:");
                }
                count = count + 1;
            }
        } while (count <= 3);
    }
}
