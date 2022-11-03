package Problems;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesProblem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        /**Non Optimal Solution : Compare each element with each element
         * What is the optimal Solution??
         * **/
        //return true if duplicates
        //print the repeating elements
        //only print distinct values
        Arrays.sort(a);
        System.out.println(ifDuplicates(a));
        printDuplicates(a);
    }

    private static void printDuplicates(int[] a) {
        //ordered array

    }

    private static boolean ifDuplicates(int[] a) {
        int i = 0;
        int len = a.length - 1;
        while (i < len) {
            if (a[i] == a[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
