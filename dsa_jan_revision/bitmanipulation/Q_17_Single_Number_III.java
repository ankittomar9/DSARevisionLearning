package dsa_jan_revision.bitmanipulation;
import java.util.Arrays;
public class Q_17_Single_Number_III {
    public static void main(String[] args) {
            int arr1[]= {1, 2, 1, 3, 2, 5};
             System.out.println("Original Array : "+ Arrays.toString(arr1));
       System.out.println("Unique Numbers Found: " + Arrays.toString(solve(arr1)));
       int arr2[]= {4,1,2,1,2,5};
             System.out.println("Original Array : "+ Arrays.toString(arr2));
       System.out.println("Unique Numbers Found: " + Arrays.toString(solve(arr2)));
    }
    public static int[] solve(int nums[]){
        if (nums == null || nums.length < 2) {
        System.out.println("Invalid input: need at least 2 numbers");
        return new int[]{};
    }
        int xorSum=0; 
        for(int num: nums){
            xorSum=xorSum^num;
        }
        int rightMostSetBit=(int)((long) xorSum &  -(long) xorSum);
        int bucketA=0; int bucketB=0;

        for(int num :nums){
            if((num & rightMostSetBit)==0){
                bucketA = bucketA^num;
            }else{
                bucketB=bucketB^num;
            }
        }
        return new int[]{bucketA,bucketB};
    } 
}
