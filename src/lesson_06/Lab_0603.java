package lesson_06;

import org.omg.CORBA.portable.ValueOutputStream;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab_0603 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString;
        String result = "";
        System.out.println(" Input your string: ");
        inputString = scanner.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                result += inputString.charAt(i);
            }
        }

        System.out.println(" Expected output: " + result);
        String regexResult = inputString.replaceAll("[^0-9]", "");
        System.out.println(" Expected output by regex: "  + regexResult);
    }
}
