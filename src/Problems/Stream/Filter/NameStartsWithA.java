package Problems.Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class NameStartsWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kavish","Aarav","Raksha");
        names.stream()
                .filter(n->n.startsWith("A"))
                .forEach(System.out::println);
    }
}
