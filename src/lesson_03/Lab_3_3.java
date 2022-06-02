package lesson_03;

import java.util.Arrays;

public class Lab_3_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
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

        System.out.println("=========== Min to Max ==========");
        int[] tempArr;
        int temp = intArr[0];
        for (int i = 0 ; i < intArr.length-1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }

        }
        for (int i = 0 ; i < intArr.length; i++){
            System.out.println("in ra các phần tử mảng sau sắp xếp " + intArr[i]);
        }

    }
}
