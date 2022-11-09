package Samples.JDK8.FunctionalInterface.DiamondProblem;

public class MultiInheritanceExample implements InterfaceExample, InterfaceExample_2 {
    @Override
    public void newMethod() {
        System.out.println("default method");
        ;
    }

    @Override
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    @Override
    public void display(String str) {
        System.out.println("String is: " + str);
    }
}
