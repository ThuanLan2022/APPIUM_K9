package lesson_04;

import java.util.*;

public class Lab_04 {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static String[] options = {
            "1. Add number into ArrayList ",
            "2. Print numbers",
            "3. Get maximum number",
            "4. Get minimum number"};

    public static void main(String[] args) {
        List<Integer> arrayList;
        arrayList = arr();
        System.out.println("The first list: " + arrayList);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Your new list is: " + arrayList);
                break;
            case 2:
                System.out.println("Print numbers: ");
                printNumbers(arrayList);
                break;
            case 3:
                System.out.println("The maximum number is: " + getMaximumNumber(arrayList));
                break;
            case 4:
                System.out.println("The minimum number is: " + getMinimumNumber(arrayList));
                break;
            default:
                System.out.println("Your option is invalid");
        }
    }
    public static int getMaximumNumber(List<Integer> list) {
        return Collections.max(list);
    }
    public static int getMinimumNumber(List<Integer> list) {
        return Collections.min(list);
    }

    public static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static int getMaxNumber(int[] intArr) {
        Arrays.sort(intArr);
        int maxNumber = intArr[0];
        for (int number : intArr) {
            System.out.println(number);
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(int[] intArr) {
        Arrays.sort(intArr);
        int minNumber = intArr[0];
        for (int number : intArr) {
            if (minNumber > number) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public static List<Integer> arr() {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(randomNumber());
        intArr.add(randomNumber());
        intArr.add(randomNumber());
        intArr.add(randomNumber());
        return intArr;
    }

    public static void printNumbers(List<Integer> arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
