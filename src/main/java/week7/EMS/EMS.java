package week7.EMS;

import java.util.List;
import java.util.stream.Collectors;

public class EMS {
    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .collect(Collectors.toList());
    }

    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(System.out::println);
    }
}

