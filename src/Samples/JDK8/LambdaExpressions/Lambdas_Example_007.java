package Samples.JDK8.LambdaExpressions;

public class Lambdas_Example_007 {
    public static void main(String[] args) {
        Speakable speak = (name) -> "Hello " + name;
        System.out.println(speak.speak("Kavish"));
    }
}
