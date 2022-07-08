package lab_08;

import java.security.SecureRandom;

import lab_08.Animal.Builder;

public class AmazingRacing {
    public static void main(String[] args) {
        Builder animalBuilder = new Builder();
        animalBuilder.setName("Tiger");
        animalBuilder.setSpeed(new SecureRandom().nextInt(100));
        animalBuilder.setFlyable(false);
        Animal tiger = animalBuilder.build();
        System.out.println(tiger);
    }
}
