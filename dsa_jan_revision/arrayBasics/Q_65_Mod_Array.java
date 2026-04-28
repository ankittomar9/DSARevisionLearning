package dsa_jan_revision.arrayBasics;

import java.util.Arrays;

public class Q_65_Mod_Array {
    public static void main(String[] args) {
        int arr1[]={1,4,3};
        int B1=2;
        System.out.println("Original Array \n"+Arrays.toString(arr1)+" % 2");
        System.out.println("Output : "+solve(arr1,B1));
        
        int arr2[]={4,3,5,3,5,3,2,1};
        int B2=47;
        System.out.println("\nOriginal Array \n"+Arrays.toString(arr2)+" % 2");
        System.out.println("Output : "+solve(arr2,B2));
        
    }
    public static int solve(int arr[],int B){
        if(arr==null || arr.length==0){return 0;}
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long currentNumber=(ans*10)+arr[i];
            ans=currentNumber%B;
        }
        return (int) ans;
    }
}
