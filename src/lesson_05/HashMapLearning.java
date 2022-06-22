package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        //Raw types
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cuu thuong");

        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
        System.out.println(emergencyList.get(116));

        emergencyList.put(116, "Something else!");
        System.out.println(emergencyList.get(116));

        System.out.println(emergencyList.get(117));

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
        System.out.println("Has 117 key: " + emergencyList.containsKey(117));
        System.out.println("Has value: " + emergencyList.containsValue("Canh sat"));
        System.out.println("Has value: " + emergencyList.containsValue("Canh sat  "));

        //Update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116,"116", "Thuan Lan");
        System.out.println(emergencyList.get(116));

        emergencyList.remove(115);
    }
}
