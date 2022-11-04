package Problems.Streams.ProblemSet001;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsProblem009 {
    /**Given a String, find the first repeated character in it using Stream functions?**/
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character result = input.chars()// Stream of String
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))// First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))//Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1L)//Check for repeating characters
                .map(entry->entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
