package dsa_june_revision.arrays;

import java.util.HashMap;

public class Q_2_A_good_pair_Optimized {
   public static void main(String[] args) {
       int[] array={1,2,3,4,4,5}; int target=7;
       // what is good pair a pair where i<j and A[i]+A[j]==target
            goodPairHelper(array, target);
   } 
   public static void goodPairHelper(int arr[],int target){
        if(arr==null || arr.length<=1){
            System.out.println("Array is empty or null");
            return ;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int totalPairs=0;

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int required =target-current;

            if(hm.containsKey(required)){
                 int freq = hm.get(required);
    totalPairs += freq;
             // Print as many times as the pair actually exists
         for (int k = 0; k < freq; k++) {
         System.out.println("Pair found: (" + required + ", " + current + ")");
            }
            } 
            hm.put(current,hm.getOrDefault(current,0)+1);
        }
        System.out.println("total Pairs  are : \n"+totalPairs);
   }
    }
