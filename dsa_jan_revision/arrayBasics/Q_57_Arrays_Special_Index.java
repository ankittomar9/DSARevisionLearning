package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_57_Arrays_Special_Index {
    public static void main(String[] args) {
       int arr[]={2,1,6,4}; System.out.println("Original Array: " 
       + Arrays.toString(arr));
    int specialCount = solve(arr);
    System.out.println("\nTotal Special Indices: " + specialCount);    
    }
    public static int solve(int arr[]){
        int n=arr.length; if(n==0) return 0; if(n==1) return 1;
        int pEven[]=new int[n];        int pOdd[]=new int[n];
        pEven[0]=arr[0]; pOdd[0]=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
                pEven[i]=pEven[i-1]+arr[i];
                pOdd[i]=pOdd[i-1];
            }else{
                pEven[i]=pEven[i-1];
                pOdd[i]=pOdd[i-1]+arr[i];
            }        }
        System.out.println("Even Prefix Array: \n" + Arrays.toString(pEven));
        System.out.println("Odd Prefix Array:  \n" + Arrays.toString(pOdd) + "\n");
        int specialCount=0;

        for(int i=0;i<n;i++){
            int evenSumBefore=(i==0)?0 :pEven[i-1];
            int OddSumBefore=(i==0)?0 :pOdd[i-1];

            int evenSumAfter=pEven[n-1]-pEven[i];
            int OddSumAfter=pOdd[n-1]-pOdd[i];
            int totalEven = evenSumBefore + OddSumAfter;
            int totalOdd = OddSumBefore + evenSumAfter;

     System.out.println("Testing Index " + i + " (Value " + arr[i] + ") \n-> New Even: " + 
        totalEven + ", New Odd: " + totalOdd + ". Match? " + (totalEven == totalOdd));
            if (totalEven == totalOdd) { specialCount++;}
        }
        return specialCount;
    }
}
