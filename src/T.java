import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class T {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("tiger","dog","cat");
        List<String> obj1 = Arrays.asList("dog","cat","wolf","monkey");
        List<String> obj2 = Arrays.asList("donkey","horse","wolf");
        /*HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();*/
        /*obj1.stream().forEach(x->s1.add(x));
        obj2.stream().forEach(x->s2.add(x));
        obj1.stream().filter(x->x.compareTo(obj2.stream().filter()))
        List<String> l1 = s1.stream().distinct(s2).collect(Collectors.toList());*/
        List<String> l1 = new ArrayList<>();
        for(int i=0;i<obj1.size();i++){
            for(int j=0;j<obj2.size();j++){
                if(!(obj1.get(i).equals(obj2.get(j)))) {
                    //do something
                    return;
                }
                /*if(obj1.get(i).equals(obj2.get(j))){
                    //store into a list
                    l1.add(obj2.get(j));*/
                }
            l1.add(obj1.get(i));

            }
        System.out.println(l1);
        }


        //stringbuilder
        //list1.stream().collect(Collectors.toCollection(String);
        //CustomerEntity::getCustomer()
        //List<String> obj1 having elements as "dog","cat","wolf","monkey"
        //List<String> obj2 having elements as "donkey","horse","wolf"
        //compare both obj1 and obj2 then return List<String> from obj1 with elements not found in obj2

    }

