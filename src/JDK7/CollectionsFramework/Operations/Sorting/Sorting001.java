package JDK7.CollectionsFramework.Operations.Sorting;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting001 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Birds");
        System.out.println("===Before Sorting===");
        animals.forEach(System.out::println);
        System.out.println();
        System.out.println("===After Sorting based on name====");
        animals.stream().sorted().forEach(System.out::println);
    }
}
