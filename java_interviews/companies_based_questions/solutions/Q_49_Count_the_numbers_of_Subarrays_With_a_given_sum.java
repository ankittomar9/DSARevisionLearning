package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.HashMap;
public class Q_49_Count_the_numbers_of_Subarrays_With_a_given_sum {
    public static void main(String args[]){
        int arr[]={1,2,3,-1,4};int target=5;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        
        int totalSubarrays = countSubarrays(arr, target);
        System.out.println("Total valid sub-arrays found: " + totalSubarrays);
    }
    public static int countSubarrays(int arr[],int target){
        if(arr==null || arr.length==0){return 0;}

        HashMap<Integer,Integer> sumHistory=new HashMap<>();
        sumHistory.put(0, 1);

        int currentSum=0;        int count =0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

            int excess=currentSum-target;

            if(sumHistory.containsKey(excess)){
                count=count+sumHistory.get(excess);
            }
            int previousCount=sumHistory.getOrDefault(currentSum, 0);
            sumHistory.put(currentSum,previousCount+1);
        }
        return count;
    }
}
