package Problems.Streams.ProblemSet001;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamsProblem_002 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(3, 5, 7, 9, 11);
        Stream<BigInteger> bigStream = stream.mapToObj(BigInteger::valueOf);
        bigStream.forEach(num-> System.out.println(num.add(BigInteger.TEN)));
    }

}

