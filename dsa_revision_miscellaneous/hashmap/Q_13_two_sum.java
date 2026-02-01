package dsa_revision_miscellaneous.hashmap;

import java.util.HashMap;

public class Q_13_two_sum {
    public static void main(String args[]){
        int arr[]={2,3,4,5,7,9};
        int target=9;

        HashMap<Integer,Integer>map=new HashMap<>();
        boolean isFound=false;
        //x+y=target , y=target-x;
        int needed=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            needed=target-current;

            if(map.containsKey(needed)){
                 System.out.println("Pair found: " + current + " and " + needed);
                System.out.println("Indices: " + map.get(needed) + " and " + i);
                isFound=true;
                break;
            }

            map.put(current, i);
        }

         if (!isFound) {
            System.out.println("No pair found");
        }
    
    }
    
}
