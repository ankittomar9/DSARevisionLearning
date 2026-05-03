package dsa_jan_revision.bitmanipulation;

public class Q_11_Unset_bits_from_right {
    public static void main(String[] args) {
    long A=25; long B=3;    
    /*Problem Statement Given an integer A and an integer B.
        Unset the last B bits of A (make them 0). */
        //we want to to turn the last three bits of 25 to zero final answer (11000) 001 to 000
        //25 Binary(168421 this is conversion code) -> (11001) 
        //Binary of 3 (8421) -> (0011)
         System.out.println("Evaluating n : "+A+ " and Position i : "+B);
        solve(A,B);

        long A2 = 37; // Binary: 100101
        long B2 = 3;  
        System.out.println("\nEvaluating n : " + A2 + " and Position i : " + B2);
        solve(A2, B2);
    }
    public static void solve(long A,long B){
        for(int i=0;i<B;i++){
            long mask =1L<<i;
            A= A & ~(mask);
        }
           System.out.println("Number after Unsetting" );
        System.out.println("  bit from right : "+A);
    }

}
