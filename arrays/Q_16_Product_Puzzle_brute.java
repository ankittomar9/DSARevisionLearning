package DSARevisionLearning.arrays;

import java.util.Arrays;

public class Q_16_Product_Puzzle_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4}; // { 24 ,12,8,6} 
        int n=arr.length;
        if(n==0){
            System.out.println("Product of Empty array doesn't exists ");
        }
        long product=1; int ans[]=new int[n];
        for(int i=0;i<n;i++){
             product=1; // reset require when we move to new element
            for(int j=0;j<n;j++){
               
                if(j!=i){
                     product=product*arr[j];
                    
                } 
                 
            }
              ans[i]=(int)product;
        }
       
         System.out.println("Product array \n"+Arrays.toString(ans));
    }
    
}
/*
TC: O(N^2)
SC :O(N)
*/