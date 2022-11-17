package Problems.Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
