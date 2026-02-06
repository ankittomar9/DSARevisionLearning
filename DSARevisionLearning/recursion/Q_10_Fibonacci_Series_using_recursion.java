package DSARevisionLearning.recursion;
public class Q_10_Fibonacci_Series_using_recursion {
    /*calculate fibonaaci series  */
    public static void main(String args[]){
        int n=7;
        //Fibonacci : 0+0=0  0+1=1 1+2=3 3+2=5 5+3=8 8+5=13 13+8=21
        // Fibonacci 0 1 1 2 3 5 8 13 21 ....        
        System.out.print( "Fibonacci Series : ");
         for(int i=0;i<=n;i++){
              System.out.print(  fibonacci_Helper(i)+" ");
        }
        System.out.println("\n The " + n + "th Fibonacci number is:");
         int result = fibonacci_Helper(n);
        System.out.println(result);
    }
    public static int fibonacci_Helper(int n){
        // base case
        if (n == 0) return 0;
        if (n == 1) return 1;

         int fn_1 = fibonacci_Helper(n - 1);
            int fn_2 = fibonacci_Helper(n - 2);
           int myResult = fn_1 + fn_2;       
             return myResult;
    }
 }
