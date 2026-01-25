package dsa_revision_miscellaneous.hashmap;

import java.util.HashMap;

public class Q_9_Frequency_of_element_query {
    public static void main(String args[]){
         /*Problem Statement Given array A = {2, 5, 9, 2, 8} and query array B = {3, 2,8}. 
            For each number in B, return how many times it appears in A */
                     int arr1[]={4, 5, 9, 4, 8};
                     int arr2[]={3, 4,8};

              HashMap<Integer,Integer> map=new HashMap<>();
              
              for(int i=0;i<arr1.length;i++){
               // if(map.containsKey(arr1[i])){
                    map.put(arr1[i],map.getOrDefault(arr1[i], 0)+1); 
            //         map.put(arr1[i], map.get(arr1[i])+1);
            //     }else{
            //         map.put(arr1[i], 1);
            //     }
               }
              System.out.println(map);

               System.out.println("Query Results: How times B present in A");
              for(int i=0;i<arr2.length;i++){
                    int queryNum=arr2[i];
                if(map.containsKey(queryNum)){
                      System.out.println(queryNum + " -> " + map.get(queryNum));
                }else{
                    System.out.println(queryNum + " -> 0");
                }
              }

    }
    
}
