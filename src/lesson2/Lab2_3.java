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
        if (BMI < 18.5){
            System.out.println("\n You are underweight!");
            float inc;
            inc = (float) (18.5 - BMI);
            System.out.println(" You should gain at least: "+inc+"kg");
        } else if (BMI <= 24.9){
            System.out.println("\n You have a healthy weight.");
        } else if (BMI <= 29.9){
            System.out.println("\n You are overweight.");
            float dec;
            dec = (float) (BMI - 24.9);
            System.out.println(" You should lose at least: "+dec+"kg");
        } else {
            System.out.println("\n You are obese.");
        }

    }
}
