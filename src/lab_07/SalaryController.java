package lab_07;

import java.util.Arrays;
import java.util.List;

public class SalaryController {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee(50000);
        Employee employee2 = new ContractEmployee(40000);
        Employee employee3 = new ContractEmployee(40000);
        SalaryController salaryController = new SalaryController();
        System.out.println("Total Salary: " + salaryController.getTotalSalary(Arrays.asList(employee1, employee2, employee3)));
    }

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}


