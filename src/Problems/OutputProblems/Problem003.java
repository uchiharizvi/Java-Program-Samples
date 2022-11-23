package Problems.OutputProblems;

public class Problem003 {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object o) {
        System.out.println("Object Method");
        System.out.println("Don't worry it will never be called");
    }
    private static void method(String s) {
        System.out.println("String Method");
        System.out.println("Explanation : ");
        System.out.println("Java will always try to use the most specific applicable version of a method that's available.");
        System.out.println("String and Object both can take null values, but since object is super class of String (generic) compiler ");
        System.out.println("will look for a specific candidate (String in this case) and hence would be given preference.");
    }
}
