package lesson_08;

import java.nio.ShortBuffer;

public class House {

    private int doorNum;
    private String topRoofColor;
    private String color;

//    // constructor has multiple attributes
//    public House(int doorNum, String topRoofColor, String color) {
//        this.doorNum = doorNum;
//        this.topRoofColor = topRoofColor;
//        this.color = color;
//    }
//
//    public static void main(String[] args) {
//
//        // Khi ma so luong doi so tang len thi khong on
//        House house = new House(1,null,"Red");
//    }


    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        House house = new House();
        house.setDoorNum(2);
        house.setColor("red");
    }

    // Immutable object : doi tuong da tao ra khong cho thay doi attribute ben trong no

}
