package lessson_09;

import java.util.List;

public class SalaryCaculator {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            if (employee instanceof FTE) {
                totalSalary = totalSalary + employee.getSalary() + employee.supportMoney();
            }
        }
        return totalSalary;
    }
}
