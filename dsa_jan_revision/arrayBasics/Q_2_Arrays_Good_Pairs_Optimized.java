package dsa_jan_revision.arrayBasics;

import java.util.HashMap;

public class Q_2_Arrays_Good_Pairs_Optimized {
    public static void main(String args[]){
         int arr[]={1,2,3,4,4,5};   
        int n=arr.length;
        int target=7;
        pairHelper(arr,target);
    }
    public static void pairHelper(int arr[],int target){
        if(arr == null || arr.length==0){System.out.println("Array is Empty");return;}

            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<arr.length;i++){
                int current=arr[i];
                int required = target-current;

                if(map.containsKey(required)){
                    System.out.println("Pairs are ( "+required+", "+current +" ) ");
                }
                map.put(current, i);
            }
            System.out.println(map);
    }
}
