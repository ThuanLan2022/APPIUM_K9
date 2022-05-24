package Lesson1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        int inputNumberA = scanner.nextInt();
        System.out.print("\nPlease input the second number: ");
        int inputNumberB = scanner.nextInt();
        if (inputNumberB == 0) {
            System.out.printf("\nThe divisor must be non-zero");
            System.out.println("\nPlease re-enter the second number: ");
            inputNumberB = scanner.nextInt();
        }
        calculators(inputNumberA, inputNumberB);
    }

    private static void calculators(int inputNumberA, int inputNumberB) {
        int sumAB, differentAB, productAB, quotientAB, remainderAB;

        //1. Sum
        sumAB = inputNumberA + inputNumberB;
        System.out.printf("\nThe sum of two numbers is: %d", sumAB);

        //2. Difference
        if (inputNumberA > inputNumberB) {
            differentAB = inputNumberA - inputNumberB;
        } else {
            differentAB = inputNumberB - inputNumberA;
        }
        System.out.printf("\nThe difference of two numbers is: %d", differentAB);

        //3. Product
        productAB = inputNumberA * inputNumberB;
        System.out.printf("\nThe product of two numbers is: %d", productAB);

        //4. Quotient
        quotientAB = inputNumberA / inputNumberB;
        remainderAB = inputNumberA % inputNumberB;
        System.out.printf("\nThe quotient of two numbers is: %d", quotientAB);
        System.out.printf("\nThe remainder of two numbers is: %d", remainderAB);
    }
}