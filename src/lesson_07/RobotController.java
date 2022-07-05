package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat batteryRobotCat = new BatteryRobotCat("BatteryRobotCat", "24/06/2022");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "24/06/2022");
        RobotCat windRobotCat = new WindRobotCat("SolarRobotCat", "24/06/2022");
        robotController.charge(Arrays.asList(solarRobotCat, batteryRobotCat, windRobotCat));
    }

    //Controller| Is-a relationship
    public void charge(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }


    }
}
