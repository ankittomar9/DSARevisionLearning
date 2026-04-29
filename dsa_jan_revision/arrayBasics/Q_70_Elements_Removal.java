package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_70_Elements_Removal {
    public static void main(String[] args) {
        int arr1[]={2,1}; 
         System.out.println("Original Array : "+Arrays.toString(arr1));
        System.out.println("Minimum Cost: " + solve(arr1) + "\n");
         int arr2[]={2,1,4}; 
         System.out.println("Original Array : "+Arrays.toString(arr2));
        System.out.println("Minimum Cost: " + solve(arr2) + "\n");
        
    }
    public static int solve(int arr[]){
        if(arr==null || arr.length==0){return 0;}    
        Arrays.sort(arr);
        int totalCost=0; int n=arr.length;
        for(int i=0;i<n;i++){
            totalCost=totalCost+arr[i]*(n-i);
        }
        return totalCost;

    }
}
