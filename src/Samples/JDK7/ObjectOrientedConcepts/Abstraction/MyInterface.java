package Samples.JDK7.ObjectOrientedConcepts.Abstraction;

public interface MyInterface {
    /**
     * default method implementation
     **/
    default void newMethod() {
        System.out.println("New Default Method");
    }
    /**
     * Static Method Implementation
     **/
    static void anotherNewMethod() {
        System.out.println("New Static Method");
    }

    /**
     * Abstract Method Implementation
     **/
    void existingMethod(String str);
}
