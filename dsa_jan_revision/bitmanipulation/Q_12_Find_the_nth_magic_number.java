package dsa_jan_revision.bitmanipulation;

public class Q_12_Find_the_nth_magic_number {
    public static void main(String[] args) {
        /*A number is called "Magic" if it can be written
         as a sum of unique powers of 5.    The numbers are sorted in increasing order. */
        int n1=3;int power1=5;
           /*       // Binary 011 -> Expected: 5^1 + 5^2 = 5 + 25 = 30        */
         System.out.println("Evaluating n : "+n1+ " and power  : "+power1);
        nthMagicNumberHelper(n1,power1);

          int n2=7;int power2=3;
             /*       // Binary 111 -> Expected: 3^1 + 3^2+ 3^3 = 3+9+27 = 39        */
         System.out.println("Evaluating n : "+n2+ " and power  : "+power2);
        nthMagicNumberHelper(n2,power2);
    }
    public static  void nthMagicNumberHelper(long n,long p){
        long power=p;
        long answer=0;
        while(n>0){
            if((n & 1)==1){
                answer=power+answer;
            }
            power=power*p;
            n=n>>1;
        }
         System.out.println("Nth Magic Number: " + answer);

    }
}
