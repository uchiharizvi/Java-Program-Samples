package Problems.Streams.ProblemSet001;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamsProblem012 {
    /** Given a list of integers, sort all the values present in it in descending order using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        numbers.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}
