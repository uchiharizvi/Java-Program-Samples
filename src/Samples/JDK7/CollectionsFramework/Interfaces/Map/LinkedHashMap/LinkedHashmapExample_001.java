package Samples.JDK7.CollectionsFramework.Interfaces.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapExample_001 {
    public static void main(String[] args) {
        Map<String, Integer> lm = new LinkedHashMap<>();
        lm.put("vishal", 10);
        lm.put("sachin", 30);
        lm.put("vaibhav", 20);
        for(Map.Entry<String, Integer> e : lm.entrySet()) System.out.println(e.getKey() +" : "+e.getValue());
    }
}
