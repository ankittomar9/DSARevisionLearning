package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_55_Arrays_Sum_Of_Even_Indices {
    public static void main(String[] args) {
        int arr[]={2,1,8,3,9};
        int queries[][]={{0,4},{1,3},{2,2}};
        System.out.println(" Original Array : "+Arrays.toString(arr));
        int[] prefixEven = buildEvenPrefix(arr);
        System.out.println("Even Prefix Array: " + Arrays.toString(prefixEven) + "\n");
        for(int q[]:queries){
            int L=q[0];
            int R=q[1];
           System.out.println("Query [" + L + ", " + R + "] -> Sum of even indices: "
            + queryEvenSum(prefixEven, L, R));
        }
    }
    public static int[] buildEvenPrefix(int arr[]){
        //Build Prefix Even Array 
        int n=arr.length;   int prefixEven[]=new int[n];
        prefixEven[0]=arr[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                prefixEven[i]=prefixEven[i-1]+arr[i];     }
                else{ prefixEven[i]=prefixEven[i-1];      }
        }
        return prefixEven;
    }
    public static int queryEvenSum(int prefixEven[],int L,int R){
        //Queries using prefix array
        if(L==0){
            return prefixEven[R];
        }else{
            return prefixEven[R]-prefixEven[L-1];
        }
       
    }
}
