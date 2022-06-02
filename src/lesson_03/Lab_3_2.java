package lesson_03;

import java.util.Arrays;

public class Lab_3_2 {
    public static void main(String[] args) {
        int[] intArr = {1,7, 2,3,4,5, 5, 9};
        Arrays.sort(intArr);

        int maxNumber = intArr[0];
        int minNumber = intArr[0];
        for (int number: intArr) {
            System.out.println(number);
            if(maxNumber<number){
                maxNumber = number;
            }
            if(minNumber>number){
                minNumber = number;
            }
        }
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Min Number: " + minNumber);
    }
}
