import java.util.*;

public class A {
    public static void main(String[] args) {

//1, 3, 4, 5, 6, 7, 1, 2, 3, 5, 1, 2
        int[] arr = {1, 3, 4, 5, 6, 7, 1, 2, 3, 5, 1, 2};
        int[] res = new int[arr.length];
        //1) sort and compare i with i+1 and store it into an array
        //
        /*Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]) {
                res[i] = arr[i];
            }*/

        Map<Integer, Integer> hashMap = new HashMap<>();
        //
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }

        }
        System.out.println(hashMap);
    }
}
