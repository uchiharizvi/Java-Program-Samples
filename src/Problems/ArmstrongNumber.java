package Problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(armstrongNumber.checkArmstrong(number));

    }

    private static boolean checkArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        for (; originalNumber != 0; originalNumber /= 10, ++n)
            ;//condensed form of n++ inside loop | used to count number of digits
        originalNumber = number;
        for (; originalNumber != 0; originalNumber /= 10) {//calculates result where on each iteration, remainder is powered by n
            remainder = originalNumber % 10;//store last digit of number
            result += Math.pow(remainder, n);//raminder to the power 4 (4^4) example
        }
        return result == number;
    }

}
