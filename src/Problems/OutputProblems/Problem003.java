package Problems.OutputProblems;

public class Problem003 {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object o) {
        System.out.println("Object Method");
    }
    private static void method(String s) {
        System.out.println("String Method");
    }
}
