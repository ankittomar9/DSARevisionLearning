package dsa_jan_revision.bitmanipulation;
import java.util.Arrays;
public class Q_21_Single_Number_II {
    public static void main(String[] args) {
        int arr1[]={5,5,5,2}; System.out.println("Original Array : \n"+Arrays.toString(arr1));
         System.out.println("Unique Number is: " + solve(arr1) + "\n");

         int arr2[]= {-2, -2, 1, 1, 4, 1, 4, 4, -4, -2};
          System.out.println("Original Array : \n"+Arrays.toString(arr2));
         System.out.println("Unique Number is: " + solve(arr2) + "\n");
    }
    public static int solve (int arr[]){
        if(arr==null || arr.length==0){System.out.println("empty or Null array \n");return 0;}
        int ans=0;
        for(int i=0;i<32;i++){
            int count =0;

            for(int j=0;j<arr.length;j++){
                if((arr[j] & (1<<i)) !=0){
                    count++;
                }
            }
            if(count %3 !=0){
                ans= ans | (1<<i);
            }
        }
        return ans;    }    }
