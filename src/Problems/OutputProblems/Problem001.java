package Problems.OutputProblems;

import java.util.HashMap;

public class Problem001 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee("a")));
    }
}
class Employee {
    private String name;
    public Employee(String name) {
        // constructor
        this.name = name;
    }
    @Override
    public int hashCode(){
        return 1;
    }
    @Override
    public boolean equals(Object obj){
        return true;
    }
    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }
}
