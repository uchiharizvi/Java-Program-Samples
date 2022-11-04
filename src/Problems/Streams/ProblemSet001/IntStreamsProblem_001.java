package Problems.Streams.ProblemSet001;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamsProblem_001 {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(3,8);
        Stream<String> stringStream = stream.mapToObj(num->Integer.toBinaryString(num));
        stringStream.forEach(System.out::println);
    }

}

