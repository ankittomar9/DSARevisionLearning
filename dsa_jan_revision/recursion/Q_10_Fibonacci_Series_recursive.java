package dsa_jan_revision.recursion;

public class Q_10_Fibonacci_Series_recursive {
    public static void main(String[] args) {
    int n=7;    
    // This is strictly for demonstration of small N values.
      System.out.print( "Fibonacci Series  for N = : "+n +"\n");
       for(int i=0;i<=n;i++){
              System.out.print(  fibonaaciHelper(i)+" ");
        }
         System.out.println("\n The " + n + "th Fibonacci number is:");
         int result = fibonaaciHelper(n);        System.out.println(result);
         int n2=12;    
    // This is strictly for demonstration of small N values.
      System.out.print( "Fibonacci Series  for N = : "+n2 +"\n");
       for(int i=0;i<=n2;i++){
              System.out.print(  fibonaaciHelper(i)+" ");
        }

         System.out.println("\n The " + n2 + "th Fibonacci number is:");
         int result2 = fibonaaciHelper(n2);
        System.out.println(result2);
    }
    public static int fibonaaciHelper(int n){
        if(n<=1) return n;
        
        int fn_1=fibonaaciHelper(n-1);
        int fn_2=fibonaaciHelper(n-2);
        int result= fn_1+fn_2;
        return result;
    }

}
