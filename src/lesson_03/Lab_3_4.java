package lesson_03;

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] intArr1 = {12, 34, 1, 16, 28};
        int[] intArr2 = {1, 12, 16, 28, 34};
        int[] newArr;
        System.out.println("======Merge 2 SORTED integer array into one SORTED array======");
        newArr = merge(intArr1, intArr2);
        sortASC(newArr);
        for (int j : newArr) {

            System.out.println("Mang moi " + j);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int arr1Index = arr1.length - 1;
        int arr2Index = arr2.length - 1;
        int arrAllIndex = arr1.length + arr2.length - 1;
        int[] arrAll = new int[arrAllIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần
        sortASC(arr1);
        sortASC(arr2);

        // trộn mảng arr1 và arr2 thành arrAll
        for (int i = arrAllIndex; i > -1; i--) {
            if (arr1Index > -1 && arr2Index > -1) {
                if (arr1[arr1Index] > arr2[arr2Index]) {
                    arrAll[i] = arr1[arr1Index--];
                } else {
                    arrAll[i] = arr2[arr2Index--];
                }
            } else if (arr2Index == -1) {
                arrAll[i] = arr1[arr1Index--];
            } else if (arr1Index == -1) {
                arrAll[i] = arr2[arr2Index--];
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
