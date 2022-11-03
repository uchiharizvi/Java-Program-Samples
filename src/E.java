/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
*/
/**Capgemani **//*

public class E {
    public static void main(String[] args) {
        //Q1 print odd numbers using Stream
        //list 10 vals
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        List<Integer> res = al.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(res);
        //Q2 Input : 150
        //Output In words
        String x = "150";
        int len = x.length();
        String[] onedigit = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] poweroftens = new String[] {"Hundred", "Thousand"};
        System.out.print(String.valueOf(x) + ": ");
        if(len == 1){
            System.out.println(onedigit[x[0]-'0']);
        }
    }
}
*/
