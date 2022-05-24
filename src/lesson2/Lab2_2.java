package lesson2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber, remainder;
        System.out.print(" Please enter an integer number: ");
        enterNumber = scanner.nextInt();
        remainder = enterNumber%2;
        if(remainder == 0)
        {
            System.out.println(" Entered number "+enterNumber+" is Even! ");
        }
        else
        {
            System.out.println(" Entered number "+enterNumber+" is Odd! ");
        }
    }
}
