package dsa_jan_revision.recursion;

public class Q_6_Reverse_Number_Using_Recursion {
    public static void main(String[] args) {
        long n=12345;  System.out.println("Original number : "+n);
          long result=reverseHelper(n,0); 
        System.out.println("Reversed number : "+result);
    }
    public static long reverseHelper(long n,long currentReverse){
        if(n==0){
             return currentReverse;
        }
        long extract=n%10;
        long newReverse=(currentReverse*10)+extract;

        long reduce=n/10;
        return reverseHelper(reduce,newReverse);
    }
}
