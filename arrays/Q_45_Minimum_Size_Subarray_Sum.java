package DSARevisionLearning.arrays;
public class Q_45_Minimum_Size_Subarray_Sum {
    public static void main(String args[]){
        /* Given an array of positive integers and a target value, find the minimal length of a 
        contiguous subarray whose sum is greater than or equal to the target
        target = 7, arr = {2, 3, 1, 2, 4, 3} subarray [4, 3] length is 2*/
        int arr[]={2,3,1,2,4,3}; int target=7;
            int n=arr.length; int min_Length=Integer.MAX_VALUE;
        if(n==0){System.out.print("-1");return;}
        int left=0; int currentSum=0;
        for(int right=0;right<n;right++){
            currentSum=currentSum+arr[right];

           while(currentSum>=target){
                min_Length=Math.min(min_Length, right-left+1);
                currentSum=currentSum-arr[left];
                left++;
            }
        }  
        if(min_Length==Integer.MAX_VALUE){
               System.out.print("0");
        }else{
 System.out.println("Minimum Length subarray of target is :\n"+min_Length);
        }
         }
    }
