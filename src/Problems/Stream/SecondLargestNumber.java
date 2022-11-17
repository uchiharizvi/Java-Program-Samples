package Problems.Stream;

import java.util.Arrays;
import java.util.Comparator;

/**WAP to find second-largest number in an array using streams*/
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] inputArray = {1,90,54,76,876};
        int secondLargest = Arrays.stream(inputArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)//Example if 2nd largest it should be set to 2
                .skip(1)//skip elements from start of array
                .findFirst()
                .get();
        System.out.println(secondLargest);
    }
}
