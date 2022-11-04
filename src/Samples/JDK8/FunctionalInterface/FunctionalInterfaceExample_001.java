package Samples.JDK8.FunctionalInterface;

public class FunctionalInterfaceExample_001 {
    public static void main(String[] args) {
        int a = 5;
        Square square = (int x) -> x * x;//Implementation of abstract method
        int result = square.calculate(a);//Invoke Abstract Method
        System.out.println(result);
    }
}

interface Square {
    int calculate(int x);
}
