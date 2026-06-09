package DSARevisionLearning.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q_84_Combination_Sum_II {
    public static void main(String[] args) {
        int candidates1[]= {10,1,2,7,6,1,5}; int target1=8;
System.out.println("Candidates: \n" + Arrays.toString(candidates1)+",Target: " + target1);
 System.out.println("Combinations: \n" + combinationSum2(candidates1, target1) + "\n");
    }
    public static List<List<Integer>> combinationSum2(int candidates1[],int target){
         List<List<Integer>> result =new ArrayList<>();
          Arrays.sort(candidates1);
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
        //We need to do Pruning Skip duplicates
        for(int i=index;i<candidates.length;i++){
               if (i>index && candidates[i]==candidates[i - 1]) {
                continue;
            }
             if (candidates[i]>remain) {
                break;
            }
            currentList.add(candidates[i]);
            backtrack(candidates, i+1, remain-candidates[i], currentList, result);
            currentList.remove(currentList.size()-1);
        }    }      }
