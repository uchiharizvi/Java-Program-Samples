package Problems.Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsProblem008 {
    /**Given a String, find the first non-repeated character in it using Stream functions?**/
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character result = input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1L)
                .map(entry->entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
