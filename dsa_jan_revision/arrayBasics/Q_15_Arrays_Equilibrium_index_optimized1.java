package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_15_Arrays_Equilibrium_index_optimized1 {
    public static void main(String args[]){
        int arr[]={-7,1,5,2,-4,3,0};
          System.out.println("Original Array "+Arrays.toString(arr));
        equilibriumIndexHelper(arr);
    }
    public static void equilibriumIndexHelper(int arr[]){
        if(arr==null || arr.length==0){System.out.println("Array is Empty");return;}
        boolean isFound=false;
        int prefixArr[]=new int [arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        int n=prefixArr.length;
        System.out.println("Prefix Array "+Arrays.toString(prefixArr));
        for(int i=0;i<arr.length;i++){
            //leftSum
            int leftSum=0;
            if(i==0){
                leftSum=0;
            }else{
                leftSum=prefixArr[i-1];
            }
            // right Sum
            int rightSum=0;
            int total_Sum=prefixArr[n-1];
            rightSum=total_Sum-prefixArr[i];
            if(leftSum == rightSum){
               System.out.println("Equilibrium Index found at "+i);
                 System.out.println("Left Sum "+leftSum+" == "+rightSum +" Right Sum");
                isFound=true;
                break;
                }
             }
                 if(isFound==false){
                System.out.println("Equilibrium index Does not exists" );
             }
        }
}
