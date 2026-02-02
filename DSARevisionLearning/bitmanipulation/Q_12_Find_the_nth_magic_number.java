package DSARevisionLearning.bitmanipulation;

public class Q_12_Find_the_nth_magic_number {
    public static void main(String args[]){
 /*A number is called "Magic" if it can be written as a sum of unique powers of 5.
         The numbers are sorted in increasing order. */
         long n=3; 
         // Binary 011 -> Expected: 5^1 + 5^2 = 5 + 25 = 30  
         //Binary 4 100 -> 1*5^3 +0*5^2 +0*5^1 =125
         //Binary 5 101 -> 1*5^3 +0*5^2 + 1*5^1 =125 +5 130
        //Binary 7 111 -> 1*5^3 +1*5^2 + 1*5^1 =125 +25+5= 155
             long power=5;
            long answer=0;
         
        while(n>0){
            if( (n & 1) !=0 ){  // check if last bit is 1
                answer=answer+power;
               
            }
             power=power*5;
            n=n>>1;
         }
         System.out.println("Nth Magic Number: "+answer);
    }
}
