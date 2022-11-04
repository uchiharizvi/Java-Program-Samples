package Samples.JDK8.Stream.Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Accumulate names into a List
 **/
public class Collectors001 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<String> list = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
