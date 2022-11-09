package Samples.JDK7.CollectionsFramework.Interfaces.Comparator.Multiple;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.employeeDepartment.compareTo(e2.employeeDepartment);
    }
}
