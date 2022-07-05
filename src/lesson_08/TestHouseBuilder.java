package lesson_08;

import lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {

    public static void main(String[] args) {
        Builder builder = new Builder();
//        builder.setDoorNum(2);
//        builder.setTopRoofColor("Red");
//        builder.setColor("Yellow");
//
//        HouseWithBuilder house = builder.build();

        // Cung co the goi nhu sau:

        HouseWithBuilder house = builder
                                    .setDoorNum(2)
                                    .setTopRoofColor("Red")
                                    .setColor("Yellow")
                                    .build();
        System.out.println(house);
    }

}
