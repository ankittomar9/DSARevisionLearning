package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.HashSet;
public class Q_45_Find_All_Pairs_Sum {
    public static void main(String args[]){
        int arr[]={1,5,7,-1,5};
        int target =6;
         System.out.println("Array: " + Arrays.toString(arr) + " | Target: " + target);
        System.out.println("Pairs found:");
        findPairs(arr, target);
    }
    public static void findPairs(int arr[],int target){
        if(arr==null || arr.length<2){
            System.out.println("Array needs at least 2 elements.");
            return;
        }
        HashSet<Integer> mySet=new HashSet<>();
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            int currentNumber=arr[i];
            int required=target-currentNumber;

            if(mySet.contains(required)){
                System.out.println("(" + required + ", " + currentNumber + ")");
                found = true;
            }
            mySet.add(currentNumber);
        }
        if (!found) {
            System.out.println("No pairs add up to the target sum.");
        }
    }
}
