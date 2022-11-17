package Problems.Stream.GroupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeesGroupByDepartment {
    public static void main(String[] args) {
        Employee employee = new Employee(001,"Kavish Rizvi","Apps");
        Employee employee2 = new Employee(002,"Rocco","Admin");
        Employee employee3 = new Employee(003,"Krish","Apps");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);

        Map<String, Long> byDept =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, TreeMap::new, Collectors.counting()));
        byDept.forEach((department, count) -> System.out.printf("%s has %d employee(s) %n", department, count));
    }
}
class Employee{
    private int employeeId;
    private String employeeName;
    private String departmentName;

    public Employee(int employeeId, String employeeName, String departmentName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
