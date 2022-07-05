package lesson_07_01;

public class TestDogId {
    public static void main(String[] args) {

        RobotDog dog = new SolarRobotDog();
       // RobotDog.changeId();
        RobotDog dog2 = new WindRobotDog();
        RobotDog dog3 = new WindRobotDog();
        System.out.println(dog.getDogId());
        System.out.println(dog2.getDogId());
        System.out.println(dog3.getDogId());
    }
}
