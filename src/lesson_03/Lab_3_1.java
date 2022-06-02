package lesson_03;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        int countEven =0;
        int countOdd = 0;
        for (int item: intArr) {
            if (item%2==0){
                countEven = countEven +1;
            }else {
                countOdd = countOdd + 1;
            }
        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
