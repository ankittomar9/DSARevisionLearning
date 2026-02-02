package dsa_jan_revision.arrays;

import java.util.HashMap;

public class Q_2_Arrays_Good_pair_two_sum_Optimized {
    public static void main(String args[]){
          int arr[]={1,4,2,3,6,5,4}; int target=7;

          // we optimized the question usig HashMAP
          HashMap<Integer,Integer> map=new HashMap<>();

          int complement=0;
          for(int i=0;i<arr.length;i++){
            complement=target-arr[i];

            if(map.containsKey(complement)){
               System.out.println("Pair found: Indices " + map.get(complement) + " and " + i);
            }

            map.put(arr[i],i);
          }

          System.out.println(map);
    }
    
}


/*TC O(n) 
    SC : O(n)
*/