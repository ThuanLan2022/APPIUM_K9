package lesson_09_01;

public abstract class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalary();

    public abstract int getSupportMonney();
}
