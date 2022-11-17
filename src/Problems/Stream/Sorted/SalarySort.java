package Problems.Stream.Sorted;

import Problems.Stream.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalarySort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"ABC", 25000));
        employees.add(new Employee(2,"DEF", 35000));

        List<Employee> sortedList = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary)
                        .reversed()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
