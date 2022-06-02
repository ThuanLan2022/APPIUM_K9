package lesson_03;

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] intArr1 = {12, 34, 1, 16, 28};
        int[] intArr2 = {1, 12, 16, 28, 34};
        int[] newArr;
        System.out.println("======Merge 2 SORTED integer array into one SORTED array======");
        newArr = merge(intArr1, intArr2);
        for (int j : newArr) {

            System.out.println("Mang moi " + j);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int aIndex = arr1.length - 1;
        int bIndex = arr2.length - 1;
        int cIndex = arr1.length + arr2.length - 1;
        int[] arrAll = new int[cIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần
        sortASC(arr1);
        sortASC(arr2);

        // trộn mảng arr1 và arr2 thành arrAll
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (arr1[aIndex] > arr2[bIndex]) {
                    arrAll[i] = arr1[aIndex--];
                } else {
                    arrAll[i] = arr2[bIndex--];
                }
            } else if (bIndex == -1) {
                arrAll[i] = arr1[aIndex--];
            } else if (aIndex == -1) {
                arrAll[i] = arr2[bIndex--];
            }
        }
        return arrAll;
    }

    public static void sortASC(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
