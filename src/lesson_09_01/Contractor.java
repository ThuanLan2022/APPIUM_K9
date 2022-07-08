package lesson_09_01;

public class Contractor extends Employee {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int getSupportMonney() {
        return 0;
    }
}
