package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

//        for (int index = 0; index < arrayLength; index++) {
//            myIntArray[index] = index + 1;
//        }
//        for (int index = 0; index < arrayLength; index++) {
//            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
//        }
        //Enhanced for loop _ dung khi khong can truy cap, thay doi gia tri trong mang

        for (int arrayElement : myIntArray) {
            System.out.println(arrayElement);
        }
    }
}
