package Problems.Stream;

import java.util.Arrays;
import java.util.List;

public class Problem_Stream_EvenNos {
    /**Given a list of integers, find out all the even numbers exist in the list using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
