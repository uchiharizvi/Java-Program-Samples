package Problems;

import java.util.Scanner;

public class NumberOfLikesDemo {

    public static void main(String[] args) {

        /*BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String P = s.nextLine();
        char[] charAtA = A.toCharArray();
        char[] charAtP = P.toCharArray();
        int counter = 0;

        for (int i = 0; i < charAtA.length ; i++){
            if (charAtA[i] == charAtP[i]) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}


