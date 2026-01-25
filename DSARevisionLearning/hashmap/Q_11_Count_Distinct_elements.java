package DSARevisionLearning.hashmap;

import java.util.HashSet;

public class Q_11_Count_Distinct_elements {
    public static void main(String args[]){
        int arr[]={2,4,8,4,6,3,6,4,3,1,5,7,1,9,4,6,9};

        //Using HashSet
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
    }
         System.out.println(set); // in set ordered is not maintained use treeSet
    
    }
}
