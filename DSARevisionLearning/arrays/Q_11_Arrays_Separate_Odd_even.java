package DSARevisionLearning.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q_11_Arrays_Separate_Odd_even {
    public static void main(String args[]){
         int nums[]={1,77,8,24,66,100,25,66};
        int n=nums.length;

        List<Integer> evenList=new ArrayList<>();
        List<Integer> oddList=new ArrayList<>();
         
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                evenList.add(nums[i]);
            }else{
                oddList.add(nums[i]);
            }
        }
        System.out.println("Even List : \n "+evenList);
         System.out.println("Odd List : \n "+oddList);
    }
    
}


/*
TC: O(n)
SC :O(N) because of arrayList
*/