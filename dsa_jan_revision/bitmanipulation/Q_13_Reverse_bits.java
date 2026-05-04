package dsa_jan_revision.bitmanipulation;

public class Q_13_Reverse_bits {
    public static void main(String[] args) {
            long n=3;System.out.println("Original Number: " + n);
            reverseBitHeper(n);
            
    }
    public static void reverseBitHeper(long n){

        long count=0;long answer=0; 
        while(count<32){
            answer=answer<<1;
            if( ( n & 1)==1){
                answer=answer+1;
            }
            count++;
            n=n>>1;
        }
           System.out.println("Reverse Number: " + answer);
    }
}
