package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    String animalName;
    int speed;

    public Animal() {
    }

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt();
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
