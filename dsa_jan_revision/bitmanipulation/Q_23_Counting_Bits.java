package dsa_jan_revision.bitmanipulation;

import java.util.Arrays;

public class Q_23_Counting_Bits {
    public static void main(String[] args) {
         int A1=5;
         System.out.println("Evaluating n = " + A1 + ":");
        System.out.println("Array: " + Arrays.toString(solve(A1)) + "\n");
        
        int n2=8;
        System.out.println("Evaluating n = " + n2 + ":");
        System.out.println("Array: " + Arrays.toString(solve(n2)));
        
    }
    public static int[] solve(int n){
       if (n < 0) {
        System.out.println("Invalid input: ");  return new int[]{0};}

        int ans[] =new int[n+1];
        ans[0]=0;

        for(int i=1;i<=n;i++){
            ans[i]=ans[i>>1]+(i & 1);
        }
        return ans;
    }    
}
