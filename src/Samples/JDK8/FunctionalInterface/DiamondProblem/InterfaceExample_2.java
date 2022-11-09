package Samples.JDK8.FunctionalInterface.DiamondProblem;

public interface InterfaceExample_2 {
    default void newMethod() {
        System.out.println("default method");
    }

    void display(String str);
}
