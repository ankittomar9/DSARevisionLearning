package DSARevisionLearning.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_81_1_Subsets {
    public static void main(String[] args) {
        int arr[]={1,2,3};System.out.println("Array: " + Arrays.toString(arr));
      List<List<Integer>> subsets = solve(arr);
        System.out.println("Subsets: " + subsets);  
    }
    public static List<List<Integer>> solve(int arr[]){
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr,0,new ArrayList<>(),result);
        return result;
    }
    public static void backtrack(int arr[],int index,
        List<Integer> currentList,List<List<Integer>> result){

            result.add(new ArrayList<>(currentList));
            for(int i=index; i<arr.length;i++){
                currentList.add(arr[i]);
                 backtrack(arr, index+1, currentList, result);
                currentList.remove(currentList.size()-1);
            }
        }
}
