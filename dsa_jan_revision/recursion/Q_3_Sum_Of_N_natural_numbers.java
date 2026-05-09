package dsa_jan_revision.recursion;

public class Q_3_Sum_Of_N_natural_numbers {
    public static void main(String[] args) {
        long n=9;
        long result=  sumOfN_NaturalNumbers(n);
 System.out.println("Sum of N natural numbers is \n"+result);
    }
    public static long sumOfN_NaturalNumbers(long n){
        if(n<=0){ return 0;}
        long sum= n+sumOfN_NaturalNumbers(n-1);
        return sum;
    }
}
