package Problems.String;

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println("What is the String ? : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String rev = reverse(inputString);
        checkIfPalindrome(inputString,rev);
    }

    private static String reverse(String str) {
        if(str.length() == 0) return "";
        return str.charAt(str.length()-1) +reverse(str.substring(0,str.length()-1));
    }

    private static void checkIfPalindrome(String str, String rev) {
        if(str.equalsIgnoreCase(rev)) System.out.println("String is a palindrome");
        else System.out.println("String is not a palindrome");
    }
}
