package dsa_jan_revision.arrays;

import java.util.HashMap;

public class Q_2_Arrays_Good_pair_two_sum_Optimized_rev {
    public static void main(String args[]){
         int arr[]={1,4,2,3,6,5,4}; int target=7;

         HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;

         int complement=0;
         for(int i=0;i<arr.length;i++){
            complement=target-arr[i];

            if(map.containsKey(complement)){
                count=count+map.get(complement);
            }
           map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
         }
         
          System.out.println("Count of Pairs are : "+count);
    }
    
}
