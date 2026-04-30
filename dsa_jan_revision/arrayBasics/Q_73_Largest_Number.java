package dsa_jan_revision.arrayBasics;

import java.util.Arrays;
import java.util.Comparator;

public class Q_73_Largest_Number {
    public static void main(String[] args) {
        int arr1[]={3,30,34,5,9}; System.out.println("Evaluating: \n"+Arrays.toString(arr1));
         System.out.println("Largest Number: " + solve(arr1) + "\n");
         int arr2[]={0,0,0}; System.out.println("Evaluating: \n"+Arrays.toString(arr2));
         System.out.println("Largest Number: " + solve(arr2) + "\n");
    }
    public static String solve(int arr[]){
        if(arr==null || arr.length==0){return "0";}
        int n=arr.length;
        String strArr[]=new String[n];
        for(int i=0;i<n;i++){ strArr[i]=String.valueOf(arr[i]);}
        
        Arrays.sort(strArr,new Comparator<String>(){
            public int compare(String a,String b){
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);}  });
          if(strArr[0].equals("0")){
            return "0";
          }      
          StringBuilder sb=new StringBuilder();
          for(String s:strArr){
            sb.append(s);
          }
          return sb.toString();
    }
}
