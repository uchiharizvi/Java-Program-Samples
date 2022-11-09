package Samples.JDK8.FunctionalInterface.DiamondProblem;

public interface InterfaceExample {
    default void newMethod() {
        System.out.println("default method");
    }

    void existingMethod(String str);
}
