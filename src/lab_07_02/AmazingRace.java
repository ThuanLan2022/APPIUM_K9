package lab_07_02;

import java.util.Arrays;
import java.util.List;

public class AmazingRace {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        AmazingRace amazingRace = new AmazingRace();
        amazingRace.getWinner(Arrays.asList(horse, dog, tiger));
    }

    public static void getWinner(List<Animal> animalList) {
        int fastestSpeed = 0;
        String animalName = null;
        for (Animal animal : animalList) {
            if (fastestSpeed < animal.getSpeed()) {
                fastestSpeed = animal.getSpeed();
                animalName = animal.getClass().getSimpleName();
            }
        }
        System.out.printf("The Winer is %s with speed: %d km/h", animalName, fastestSpeed);
    }
}
