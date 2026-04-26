package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_56_Arrays_Sum_Of_Odd_Indices {
     public static void main(String[] args) {
        int arr[]={2,1,8,3,9};
        int queries[][]={{0,4},{1,3},{2,2}};
        System.out.println(" Original Array : "+Arrays.toString(arr));
        int[] prefixOdd = buildOddPrefix(arr);
        System.out.println("Odd Prefix Array: " + Arrays.toString(prefixOdd) + "\n");
        for(int q[]:queries){
            int L=q[0];
            int R=q[1];
           System.out.println("Query [" + L + ", " + R + "] -> Sum of Odd indices: "
            + queryOddSum(prefixOdd, L, R));
        }
    }
    public static int[] buildOddPrefix(int arr[]){
        //Build Prefix Even Array 
        int n=arr.length;   int prefixOdd[]=new int[n];
        prefixOdd[0]=0;
        for(int i=1;i<n;i++){
            if(i%2!=0){ prefixOdd[i]=prefixOdd[i-1]+arr[i];     }
                else{ prefixOdd[i]=prefixOdd[i-1];              }
        }
        return prefixOdd;
    }
    public static int queryOddSum(int prefixOdd[],int L,int R){
        //Queries using prefix array
        if(L==0){
            return prefixOdd[R];
        }else{
            return prefixOdd[R]-prefixOdd[L-1];
        }          }        }
