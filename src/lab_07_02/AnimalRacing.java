package lab_07_02;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal horse = new HorseSpeed(75);
        Animal tiger = new TigerSpeed(100);
        Animal dog = new DogSpeed(60);
        AnimalRacing.getWinner(Arrays.asList(horse, dog,tiger));
    }

    public static void getWinner(List<Animal> animalsList) {
        int fastestSpeed =0;
        for (Animal animal:animalsList) {
           if(fastestSpeed< animal.getSpeed())
               fastestSpeed= animal.getSpeed();
        }
        System.out.println("Winner speed: " + fastestSpeed);

    }
}
