package Problems.Stream;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondMaxSalary {
    public static void main(String[] args) {
        List<SecondMaxSalary_Employee> employeeList = new ArrayList<>();

        employeeList.add(new SecondMaxSalary_Employee(111, "A", 25000));
        employeeList.add(new SecondMaxSalary_Employee(122, "B", 13500));
        employeeList.add(new SecondMaxSalary_Employee(133, "C", 18000));

        Optional<SecondMaxSalary_Employee> emp = employeeList.stream()
                .collect(Collectors.maxBy(
                        Comparator.comparingInt(SecondMaxSalary_Employee::getSalary)
                ));
        emp.stream().forEach(System.out::println);
    }

}
class SecondMaxSalary_Employee {
    private int employeeId;
    private String employeeName;
    private int salary;

    public SecondMaxSalary_Employee(int employeeId, String employeeName,int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SecondMaxSalary_Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
