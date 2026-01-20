package DSARevisionLearning.arrays;

public class Q_10_Arrays__Minimum_Pick_Even_Odd {
    public static void main(String args[]){
         /* given an array of integers nums of size N.
        Return the difference between the maximum among all even
            numbers of nums and the minimum among all odd numbers in nums. */

        int nums[]={1,77,8,24,66,100,25,66};
        //[10, -20, 15, -5]
            int Even_max=Integer.MIN_VALUE;
            int Odd_Min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                Even_max=Math.max(Even_max, nums[i]);
            }else{
                  Odd_Min=Math.min(Odd_Min, nums[i]);
            }
        }
        double difference=Math.abs(Even_max-Odd_Min);
        System.out.println("absolute diff between even max and odd min is");
         System.out.println(difference);
    }
}
