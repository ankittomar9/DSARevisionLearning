package DSARevisionLearning.arrays;
import java.util.Arrays;
public class Q_8_Arrays_k_element_maximum {
    public static void main(String args[]){
//given an array, nums, of N integers. In a particular operation, he can set any element of the array equal to -1.
// finding out the minimum number of operations required such that the maximum element
// of the resulting array is k. If it is not possible, then return -1.
        int nums[]={2,4,3,1,5 ,6,9,1,2,7};
        int k=3;
        // so we need find the elements greater than k and set them to -1 so that k becomes maximum
        int count_of_operations=0;
            boolean hasK=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                hasK=true;
            }
            if(nums[i]>k){
                
                nums[i]=-1;
                count_of_operations++;
            }
        }
       if(hasK){
         System.out.println("Arrays after values replaced \n "+Arrays.toString(nums));
             System.out.println("Count of Operations required \n"+count_of_operations);
       }else{
        System.out.println("k doesn't exists (-1)");
       }
    }    
}


/*
TC: O(n)
SC :O(1)
*/