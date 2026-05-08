package dsa_jan_revision.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_24_Subsets {
    public static void main(String[] args) {
        int arr[]={1, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        List<List<Integer>> result = solve(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Subset " + i + ": " + result.get(i));
        }
    }
    public static List<List<Integer>> solve(int arr[]){
if(arr==null || arr.length==0){System.out.println("empty or Null array \n");return new ArrayList<>();}
        List<List<Integer>> ans= new ArrayList<>();
        int n=arr.length;
        int totalSubsets = 1<<n;

        for(int i=0;i<totalSubsets;i++){
            List<Integer> currenSubset =new ArrayList<>();

            for(int j=0; j<n;j++){

                if((i & (1<<j)) !=0){
                    currenSubset.add(arr[j]);
                }
            }
            ans.add(currenSubset);
        }
        return ans;
    }
}
