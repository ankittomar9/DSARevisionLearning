package DSARevisionLearning.recursion;
public class Q_6_Reverse_Number_Using_Recursion_v2 {
    /*/*Reverse a Number using Recursion Best Practice using Accumulator */
    public static void main(String args[]){
        long n=12345;
          System.out.println("Original number : "+n);
        //expected output  54321
        long result=reverseHelper(n,0); 
        // to reach the numbers place like ones tens hundred thousand and ten Thousand

        System.out.println("Reversed number : "+result);
    }
    public static long reverseHelper(long n,long currentReverse){
                 if(n==0){  
                 return currentReverse;    }

            long extract=n%10;
            long newReverse=(currentReverse*10)+extract;
            
            long reduce=n/10;

            return reverseHelper(reduce,newReverse);
    }
    
}
