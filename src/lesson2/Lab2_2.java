package lesson2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber, remainder;
        System.out.print(" Please enter your number: ");
        enterNumber = scanner.nextInt();
        remainder = enterNumber%2;
        if(remainder == 0)
        {
            System.out.println(" Your number "+enterNumber+" is an even number! ");
        }
        else
        {
            System.out.println(" Your number "+enterNumber+" is an odd number! ");
        }
    }
}
