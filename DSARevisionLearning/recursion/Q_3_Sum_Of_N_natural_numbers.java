package DSARevisionLearning.recursion;

public class Q_3_Sum_Of_N_natural_numbers {
    /* do Sum of N natural Numbers */
    public static void main(String args[]){
        long n=9;
        long result=  sum_calculate_helper(n);
        System.out.println("Sum of N natural numbers is \n"+result);
    }
    public static long sum_calculate_helper(long n){
        if(n<=0){
            return 0;
        }
      
        long sum=n+sum_calculate_helper(n-1);
        return sum;
    }
    
}
