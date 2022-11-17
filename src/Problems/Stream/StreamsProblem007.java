package Problems.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamsProblem007 {
    /**Given a list of integers, find the maximum value element present in it using Stream functions?**/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32,98,10);
        int max = numbers.stream().max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
