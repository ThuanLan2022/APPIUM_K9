package lesson_07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat meo = new BatteryRobotCat();
        meo.setName("Meo");
        meo.setProductionDate("23/06/2022");
        System.out.println(meo);
        // RobotCat miu = new BatteryRobotCat();
    }
}
