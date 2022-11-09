package Problems.String;

/**
 * WAP to reverse a String without Library Functions/ loop
 */
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String s = "Kavish Rizvi";
        System.out.println(reverse(s));
    }

    /**
     * reverse a String without Library Functions/ loop (Use Recursion)
     */
    static String reverse(String s) {
        if (s.length() == 0) return "";
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
