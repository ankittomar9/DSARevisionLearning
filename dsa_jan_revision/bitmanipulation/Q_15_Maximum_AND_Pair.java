package dsa_jan_revision.bitmanipulation;
import java.util.Arrays;
public class Q_15_Maximum_AND_Pair {
    public static void main(String[] args) {
        /*Given an array A. For every pair of indices i and j (i != j),
         find the maximum A[i] & A[j]. */
        int arr1[]={26,13,23,28,27,7,25};
        System.out.println("Original Array : "+ Arrays.toString(arr1));
        System.out.println("Maximum AND Pair Value: " + solve(arr1) + "\n");

        int arr2[]={16,9,6,13};
        System.out.println("Original Array : "+ Arrays.toString(arr2));
        System.out.println("Maximum AND Pair Value: " + solve(arr2) + "\n");
    }
    public static int solve(int arr[]){
        if(arr==null || arr.length==0){ System.out.println("Empty or null Array :");return  0;}
        int ans=0;
        for(int i=30; i>=0;i--){
            int potentialAns= ans | (1<<i);
            int count =0;

            for(int j=0;j<arr.length;j++){
                if((arr[j] & potentialAns)== potentialAns){
                    count++;
                }
            }
            if(count >=2){
                ans=potentialAns;
            }
        }
        return ans;
    }
}
