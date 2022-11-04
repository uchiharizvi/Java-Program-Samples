package Samples.JDK7.CollectionsFramework.Interfaces.Comparable;

public class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        if (age == s.age) return 0;
        else if (age > s.age) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

}
