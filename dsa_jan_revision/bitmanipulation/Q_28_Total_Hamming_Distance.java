package dsa_jan_revision.bitmanipulation;
import java.util.Arrays;
public class Q_28_Total_Hamming_Distance {
    public static void main(String[] args) {
    int nums[]={4, 14, 2};
    System.out.println("Original Array: \n"+Arrays.toString(nums));
    System.out.println("Total Hamming Distance: " + solve(nums));
    }
    public static int solve(int arr[]){
         if(arr==null || arr.length==0)
            {System.out.println("empty or Null array \n");return 0;}
        int totalDistance=0;
        int n=arr.length;

        for(int i=0;i<32;i++){
            int count1=0;

            for(int num:arr){
                if((num & (1<<i))!=0){
                    count1++;
                }
            }
                 int count0=n-count1;
        totalDistance = totalDistance +(count1*count0);
        }
        return totalDistance;
    }
 }

