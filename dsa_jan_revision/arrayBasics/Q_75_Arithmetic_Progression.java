package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_75_Arithmetic_Progression {
    public static void main(String[] args) {
        int arr1[]={3,5,1};
         System.out.println("Evaluating: \n"+Arrays.toString(arr1));
         System.out.println("Result: \n" + solve(arr1) + "\n");
         int arr2[]={2,4,1}; System.out.println("Evaluating: \n"+Arrays.toString(arr2));
         System.out.println("Result : \n" + solve(arr2) + "\n");

    }
    public static int solve(int arr[]){
       if (arr == null || arr.length == 0) return 0;
        if (arr.length <= 2) return 1;
        Arrays.sort(arr);
       
        int expectedDiff=arr[1]-arr[0];
         System.out.println("Expected Diff : "+expectedDiff);
        for(int i=1;i<arr.length;i++){
            int currentDiff=arr[i]-arr[i-1];
                        System.out.println("Diff between " + arr[i - 1] + " and "
                         + arr[i] + " = " + currentDiff);
            if(currentDiff != expectedDiff){
                return 0;
            }           
        }      
        return 1;
    }
}
