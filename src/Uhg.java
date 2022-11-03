import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uhg {
    public static void main(String[] args) {
        //s="anagram" t="nagaram"
        Scanner scan = new Scanner(System.in);
        String s = scan.next();//O(1)
        String t = scan.next();//O(1)
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Map<Object, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(c[i])) {
                m.put(c[i], m.get(c[i] + 1));
            } else {
                m.put(c[i], 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (m.containsKey(d[i])) {
                if (m.get(d[i]) > 0) {
                    m.put(c[i], m.get(c[i] - 1));
                } else {
                    m.remove(d[i]);
                }
                //remove
                //m.remove()

            /*}else{
                //
            }*/
            }

            //char[] c and char[] d //O(1)
            //a:2,n:1,g:1,r:1,m;1//
            //a:3,n:1,g:1,r:1,m;1//
            //a:x
            //a:y
            //if
        }

    }
}