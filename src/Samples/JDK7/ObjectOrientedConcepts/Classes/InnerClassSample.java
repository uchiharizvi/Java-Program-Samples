package Samples.JDK7.ObjectOrientedConcepts.Classes;

public class InnerClassSample {
    void print() {
        System.out.println("Class Synechron.A");
    }

    class B {
        void print() {
            System.out.println("Class Synechron.A.B");
        }
    }
}
