package dsa_june_revision.arrays;

public class Q_8_Arrays_k_element_maximum {
    public static void main(String[] args) {
//given an array, nums, of N integers. In a particular operation, he can set any element of the array equal to -1.
// finding out the minimum number of operations required such that the maximum element
// of the resulting array is k. If it is not possible, then return -1.
        int nums[]={2,4,3,1,5 ,6,9,1,2,7};
        int k=3;
        // so we need find the elements greater than k and set them to -1 so that k becomes maximum

    }
    public static void kOperationsHelper(int[] arr,int k){
        if(arr==null || arr.length==0){
            System.out.println("Array is empty or null");return ;
        }
        int noOfOperations=0; boolean isFound=false;



    }
}
