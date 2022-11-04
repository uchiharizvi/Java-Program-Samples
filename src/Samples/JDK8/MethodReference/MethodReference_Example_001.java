package Samples.JDK8.MethodReference;

public class MethodReference_Example_001 {
    public static void main(String[] args) {
        Sayable say = MethodReference_Example_001::saySomething;
        say.say();
    }
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
}
