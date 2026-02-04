package DSARevisionLearning.recursion;

public class Q_6_Reverse_Number_Using_Recursion_v2 {
    public static void main(String args[]){
        long n=12345;
          System.out.println("Original number : "+n);
        //expected output  54321
        long result=reverseHelper(n);

        System.out.println("Reversed number : "+result);
    }
    public static long reverseHelper(long n){
        if(n==0){            return 0;    }

            long extract=n%10;
            long reverse=extract*10;
            
            long reduce=n/10;

            return reverse;
    }
    
}
