package DSARevisionLearning.hashmap;
import java.util.HashMap;
public class Q_12_1_Longest_Subarray_with_0_Sum {
    public static void main(String args[]){
               int arr[]={4,2,-3,1,6};
                int n=arr.length;        int currentSum=0; int maxLength=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum==0){
               //   System.out.println("Found subarray with 0 sum ending at index " + i);
               maxLength=i+1;
            }

            if(map.containsKey(currentSum)){
               int previousIndex=map.get(currentSum);
                int currentLen=i-previousIndex;

                maxLength=Math.max(currentLen,maxLength);
                }else{
                     map.put(currentSum,i);
                }
           
        }
            System.out.println("Longest Subarray Length with sum zero : " + maxLength);
       
    }
}
