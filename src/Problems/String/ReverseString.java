package Problems.String;

/**
 * Reverse a String using reverse()
 **/
public class ReverseString {
    public static void main(String[] args) {
        String s = "My Name is Anthony Gonsalves";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return String.valueOf(sb.reverse());

    }
}
