package lesson_09_01;

public class FTE extends Employee {
    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getSupportMonney() {
        return 5000;
    }
}
