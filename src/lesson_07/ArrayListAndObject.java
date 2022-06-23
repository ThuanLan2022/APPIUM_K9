package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        Person teo2 = new Person();
        teo.setName("Tèo");
        teo.setAge(20);
        personList.add(teo);
        personList.add(teo2);
        System.out.println(personList);

        personList.get(1).setName("Tí");
        System.out.println(personList);
    }
}
