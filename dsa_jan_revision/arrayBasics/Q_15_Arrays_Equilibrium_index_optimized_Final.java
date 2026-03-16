package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_15_Arrays_Equilibrium_index_optimized_Final {
    public static void main(String args[]){
         int arr[]={-7,1,5,2,-4,3,0};
          System.out.println("Original Array "+Arrays.toString(arr));
        equilibriumIndexHelper(arr);
    }
    public static void equilibriumIndexHelper(int arr[]){
        int totalSum=0; boolean isFound=false;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){

            //rightSum
              int rightSum=totalSum-leftSum-arr[i];

              if(leftSum==rightSum){
              System.out.println("Equilibrium Index found at "+i);
                System.out.println("leftSum "+leftSum + " == "+rightSum + " rightSum");
              isFound=true;
              break;
        }
        leftSum=leftSum+arr[i];
        }
         if(isFound==false){
                System.out.println("Equilibrium index Does not exists" );
             }
    }
}
