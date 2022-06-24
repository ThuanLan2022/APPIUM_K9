package lesson_07;

// Sub-class, child class, concrete class
public class SolarRobotCat extends RobotCat {
    public SolarRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with solar";
    }


}
