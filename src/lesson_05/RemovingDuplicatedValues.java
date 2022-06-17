package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(5);
        myArrayList.add(6);

        // Lay 3 gt nho nhat cua myArrayList
        List<Integer> withoutDuplicateValuesList = new ArrayList<>();
        for (Integer number : myArrayList) {
            if (!withoutDuplicateValuesList.contains(number)) {
                withoutDuplicateValuesList.add(number);
            }

        }
        System.out.println(withoutDuplicateValuesList);
        Collections.sort(withoutDuplicateValuesList);
        System.out.println(withoutDuplicateValuesList);

        //Set_Lay ra mang cac phan tu khong trung nhau
        Set<Integer> set = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(set);
        System.out.println(myArrayList);

    }
}
