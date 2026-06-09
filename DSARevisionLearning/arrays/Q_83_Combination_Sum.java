package DSARevisionLearning.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q_83_Combination_Sum {
    public static void main(String[] args) {
        int candidates1[]={2,3,6,7}; int target1=7;
System.out.println("Candidates: \n" + Arrays.toString(candidates1)+", Target: " + target1);
 System.out.println("Combinations: \n" + combinationSum(candidates1, target1) + "\n");

  int candidates2[] = {2,3,5};  int target2=8;
 System.out.println("Candidates: \n" + Arrays.toString(candidates2) + ", Target: " + target2);
     System.out.println("Combinations: \n" + combinationSum(candidates2, target2));
    }
    public static List<List<Integer>> combinationSum(int candidates1[],int target){
         List<List<Integer>> result =new ArrayList<>();
        backtrack(candidates1, 0, target, new ArrayList<>(), result);
        return result;
   }
   public static void backtrack(int candidates[] ,int index,int remain,
    List<Integer> currentList, List<List<Integer>> result){
        if(remain <0){return ;} //base case 1
        if(remain ==0){           // base case 2
            result.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            currentList.add(candidates[i]);
            backtrack(candidates, i, remain-candidates[i], currentList, result);
            currentList.remove(currentList.size()-1);
        }
    }
}