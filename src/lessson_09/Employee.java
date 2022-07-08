package lessson_09;

public class Employee {
    String name;
    int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return 0;
    }

    public int supportMoney(){
        return 5000;
    }

}
