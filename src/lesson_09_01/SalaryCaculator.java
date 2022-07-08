package lesson_09_01;

import java.util.List;

public class SalaryCaculator {
    // IS-A Relationship
    public int getTotalSalary(List<Employee> employeeList){

        int totalSalary =0;
        for (Employee employee : employeeList) {
           totalSalary = totalSalary + employee.getSalary() + employee.getSupportMonney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
      //  Employee employee = new Employee("Teo"); => Ko the new moi mot abstract nhu nay
        Employee employee = new FTE("Teo");
    }
}
