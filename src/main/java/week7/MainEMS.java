package week7;

import week7.EMS.EMS;
import week7.EMS.Employee;

import java.util.Arrays;
import java.util.List;

public class MainEMS {
    public static void main(String[] args) {
        EMS employeeManagementSystem = new EMS();

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000.0),
                new Employee(2, "Jane", 60000.0),
                new Employee(3, "Doe", 75000.0)
        );

        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 60000.0);
        System.out.println("Filtered Employees: ");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total Salary: $" + totalSalary);

        System.out.println("Employee Details: ");
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}

