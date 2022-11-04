package Samples.JDK7.CollectionsFramework.Interfaces.Comparator.Multiple;

import org.java.tutorials.collections.comparator.Employee;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.employeeId - e2.employeeId;
    }
}
