package Samples.JDK7.CollectionsFramework.Interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Vijay",23));
        students.add(new Student(106,"Ajay",27));
        students.add(new Student(105,"Jai",21));
        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
