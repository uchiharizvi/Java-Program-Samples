package Samples.JDK8.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Lambdas_Example_005 {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = ()-> System.out.println("Drawing " + width);
        drawable.draw();
    }
}
