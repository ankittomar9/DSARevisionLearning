package DSARevisionLearning.bitmanipulation;

public class Q_11_Unset_bits_from_right {
    public static void main(String args[]){
         /*Problem Statement Given an integer A and an integer B.
        Unset the last B bits of A (make them 0). */
        long A=25; long B=3;
         //we want to to turn the last three bits of 25 to zero final answer (11000) 
        //25 Binary(168421 this is conversion code) -> (11001)- 
        // To change last 3 001 to 000
        //Binary of 3 (8421) -> (000101)
        // to change a bit from 1 to zero we use AND Operation
        long result=0;
       

        for(int i=0;i<B;i++){
             long mask=1<<B;
            result= A & ~(mask);
        }

         System.out.println("Original number :"+A);
        System.out.println("Modified number after Unsetting last 3 bits \n :"+result);
    }
    
}
