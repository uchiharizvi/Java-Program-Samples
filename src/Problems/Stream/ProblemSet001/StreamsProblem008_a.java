package Problems.Stream.ProblemSet001;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsProblem008_a {
    /**Given a String, find the first non-repeated character in it using Stream functions?**/
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character result = input.chars()
                .mapToObj(a->Character.toLowerCase(Character.valueOf((char)a)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>=1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result);

    }
}
