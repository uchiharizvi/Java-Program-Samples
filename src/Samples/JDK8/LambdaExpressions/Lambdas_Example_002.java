package Samples.JDK8.LambdaExpressions;

public class Lambdas_Example_002 {
    public static void main(String[] args) {

        /**Lambda expression without return keyword.**/
        /**Functional Interface Usage using Add Operation**/
        Operations add = (a,b)->(a+b);
        System.out.println(add.performOperation(10,20));
        /**Functional Interface Usage using Substract Operation**/
        Operations sub = (a,b)->(b-a);
        System.out.println(sub.performOperation(10,20));
    }
}
