package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myArrayList2 = Arrays.asList(1, 2, 3);

        //CRUD
        myArrayList.add(1);
        myArrayList.add(2, 3);

        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
            System.out.println(myArrayList.remove(1));
        }

        for (int integer : myArrayList) {
            System.out.println(integer);
        }
        myArrayList.remove(1);
        myArrayList.remove(new Integer(1));
        System.out.println(myArrayList);

        // Check empty
        if (!myArrayList.isEmpty()) {
            System.out.println("List's size: " + myArrayList.size());
        }

        // Check element's existence
        System.out.println(myArrayList.contains(1));
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.indexOf(4));
    }
}
