package Problems;

import java.util.Scanner;

public class PalindromeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        System.out.println(checkPalindrome(a));
    }

    private static boolean checkPalindrome(String a) {
        char[] c = a.toCharArray();
        int mid = a.length()/2;
        int len = a.length()-1;
        for(int i=0;i<len;i++){
            if(c[i] == c[len]){
                len--;
            }else return false;
        }
        return true;
    }
}
