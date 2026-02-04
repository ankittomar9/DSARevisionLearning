package DSARevisionLearning.recursion;

public class Q_4_Factorial_of_number {
    public static void main(String args[]){
        /*Calulcate factorial of a number */
        long n=5;
        long result = factorial_helper(n);
        System.out.println("Factorial of number is \n"+result);

    }
    public static long factorial_helper(long n){
        if(n<=0 || n==1){   //factorial of 0! is 1 and 1 is 1;
            return 1; } // base case

        //main Logic
        long fact= n * factorial_helper(n-1);
        return fact;
    }
}

/*
TC: is same O(n) 
Space is O(N) which is the call stack height becuase there are n calls
*/