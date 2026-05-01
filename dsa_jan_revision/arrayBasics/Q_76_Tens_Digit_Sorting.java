package dsa_jan_revision.arrayBasics;

import java.util.Arrays;
import java.util.Comparator;

public class Q_76_Tens_Digit_Sorting {
    public static void main(String[] args) {
         int arr1[]={15,11,7,19};
          System.out.println("Evaluating: \n"+Arrays.toString(arr1));
         System.out.println("Result: " + Arrays.toString(solve(arr1)) + "\n");

         int arr2[]={2,24,22,10};
          System.out.println("Evaluating: \n"+Arrays.toString(arr2));
         System.out.println("Result: " + Arrays.toString(solve(arr2)) + "\n");
    }
    public static int[] solve(int arr[]){
        int n=arr.length;

        Integer objArray[]= new Integer[n];
        for(int i=0;i<n;i++){ objArray[i]=arr[i];}

        Arrays.sort(objArray,new Comparator<Integer> (){
        
        public int compare(Integer val1,Integer val2){
            int tens1=(val1/10)%10;
            int tens2=(val2/10)%10;

            if(tens1== tens2){
                return Integer.compare(val2, val1);
            }
            return Integer.compare(tens1,tens2);
            }});
        for(int i=0;i<n;i++){arr[i]=objArray[i];}

        return arr;
    }
   
}
