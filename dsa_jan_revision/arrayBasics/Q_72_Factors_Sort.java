package dsa_jan_revision.arrayBasics;

import java.util.Arrays;
import java.util.Comparator;

public class Q_72_Factors_Sort {
    public static void main(String[] args) {
        int arr1[]={6,8,9}; 
        System.out.println("Original Array: \n" + Arrays.toString(arr1) + "\n");
        System.out.println("Result: \n" + Arrays.toString(solve(arr1)) + "\n");
         int arr2[]={2,4,7}; 
          System.out.println("Original Array: \n" + Arrays.toString(arr2) + "\n");
         System.out.println("Result: \n" + Arrays.toString(solve(arr2)) + "\n");
    }
    public static int[] solve(int arr[]){
      if(arr==null || arr.length==0){return  arr;}
        int n=arr.length; 
        Integer[] objArray=new Integer[n];
        for(int i=0;i<n;i++){objArray[i]=arr[i];}

       Arrays.sort(objArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                int count1 = countFactors(val1);
                int count2 = countFactors(val2);

                if (count1 == count2) {
                    return Integer.compare(val1, val2);
                }
                return Integer.compare(count1, count2);
            }});
            for(int i=0;i<n;i++){arr[i]=objArray[i];}
            return arr;
    }
    public static int countFactors(int num){
        int factors=0; 
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
            if(i*i==num){
                factors += 1;
            }else{
               factors += 2;
            }        }    }
        return factors;
    }
}
