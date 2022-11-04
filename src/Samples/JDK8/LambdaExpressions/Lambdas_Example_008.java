package Samples.JDK8.LambdaExpressions;

public class Lambdas_Example_008 {
    public static void main(String[] args) {
        Speakable speak = (message) -> {
            String s1 = "I would like to say, ";
            String s2 = s1 + message;
            return s2;
        };
        System.out.println(speak.speak("time is precious."));
    }
}
