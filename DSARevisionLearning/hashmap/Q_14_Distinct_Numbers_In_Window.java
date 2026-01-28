package DSARevisionLearning.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q_14_Distinct_Numbers_In_Window {
    public static void main(String args[]){
        int arr[]={1,2,1,3,4,3}; int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        // we need to count how many distinct elements are there in a window
        // [1,1,1] = count 1 but [2 1 3 ] count is 3
        List<Integer>list =new ArrayList<>();
        //frequency hashmap
        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        list.add(map.size());
        
            //Window movement
            for(int i=k;i<arr.length;i++){
                int outgoing=arr[i-k];
                // Removing the element going OUT (index i - K)
                if(map.get(outgoing)==1){
                    map.remove(outgoing);
                }else{
                    map.put(outgoing, map.get(outgoing)-1);
                }

                //Add the element coming IN (index i)
                int incoming =arr[i];
                map.put(incoming, map.getOrDefault(incoming, 0) + 1);
                list.add(map.size());
            }   
            System.out.println("Distinct counts per window: " + list);
    }    
}
