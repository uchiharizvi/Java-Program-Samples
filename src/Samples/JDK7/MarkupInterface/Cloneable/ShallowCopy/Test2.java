package Samples.JDK7.MarkupInterface.Cloneable.ShallowCopy;

public class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
