package lesson_03;

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] intArr1 = {12, 34, 1, 16, 28};
        int[] intArr2 = {1, 12, 16, 28, 34};
        int [] newArr = null;
        System.out.println("======Merge 2 SORTED integer array into one SORTED array======");
        newArr = merge(intArr1, intArr2);
        int leng2Arr = intArr1.length + intArr2.length;
        for (int a; a< newArr.length; a++ ){

            System.out.println("Mang moi " + newArr[i] );
        }
    }
    public static int[] merge(int[] a, int[] b) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        int[] c = new int[cIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần
        sortASC(a);
        sortASC(b);

        // trộn mảng a và b thành c
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
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
