package Samples.JDK7.CollectionsFramework.Interfaces.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map hm = new HashMap<String, String>();
        Map tm = new TreeMap<String, String>();

        //Adding values to hm
        hm.put("A", "a");
        hm.put("E","e");
        hm.put("D","d");
        hm.put("C","c");
        hm.put("B","b");
        hm.put("F","f");
        //Adding values to tm
        tm.put("A", "a");
        tm.put("B","b");
        tm.put("C","c");
        tm.put("D","d");
        tm.put("E","e");
        tm.put("F","f");

        System.out.println("Printing HashMap : ");
        System.out.println(hm);
        System.out.println("Printing TreeMap");
        System.out.println(tm);



    }

}
