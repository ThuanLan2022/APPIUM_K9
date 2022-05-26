package lesson2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float yourWeight, yourHeight,BMI;

        System.out.print(" Please enter your weight: ");
        yourWeight = scanner.nextFloat();
        System.out.print(" Please enter your height: ");
        yourHeight = scanner.nextFloat();
        if(yourHeight==0){
            System.out.print("\nYour height must be non-zero");
            System.out.println("\nPlease re-enter your height: ");
            yourHeight = scanner.nextFloat();
        }
        BMI =  yourWeight/ (yourHeight * 2);
        System.out.printf(" Your BMI: %.1f", BMI);
        if (BMI < 18.5f){
            System.out.println("\n You are underweight!");
            float incWeight;
            incWeight = 18.5f - BMI;
            System.out.println(" You should gain at least: "+incWeight+"kg");
        } else if (BMI <= 24.9f){
            System.out.println("\n You have a healthy weight.");
        } else if (BMI <= 29.9f){
            System.out.println("\n You are overweight.");
            float decWeight;
            decWeight = BMI - 24.9f;
            System.out.println(" You should lose at least: "+decWeight+"kg");
        } else {
            System.out.println("\n You are obese.");
        }

    }
}
