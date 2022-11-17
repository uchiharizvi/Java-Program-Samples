package Problems.Stream.ProblemSet001;

import java.util.stream.Stream;

public class StreamsProblem015 {
    public static void main(String[] args) {
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }

}

