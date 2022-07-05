package lesson_07_01;

import java.lang.reflect.Constructor;

public class RobotDog {

    protected static int dogId =0;
private int robotId;
    public RobotDog() {
        robotId = dogId +1;
        dogId++;
    }

    public int getDogId() {
        return robotId;
    }

    public static int changeId(){
       return dogId++;
    }
}