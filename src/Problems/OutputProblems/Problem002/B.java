package Problems.OutputProblems.Problem002;

import Problems.OutputProblems.Problem002.A;

public interface B extends A {
    @Override
    default void name() {
        System.out.println("B");
    }
}
