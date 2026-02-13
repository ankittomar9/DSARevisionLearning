package java_interviews.companies_based_questions.solutions;

public class Q_5_Reverse_number {
        public static void main(String args[]){
            int n= -123; // code works for negative case
               System.out.println("Original Number : "+n);
            int result=reverseHelper(n);
                   System.out.println("Reverse Number : "+result);
        }

        public static int reverseHelper(int n){
            if(n==0){ // edge case 1
                return 0;
            }
           long reverse=0;
            while(n!=0){
                long lastDigit=n%10;
               reverse =reverse*10+lastDigit;
                n=n/10;
            }

            // FIX 2: Check for Integer Overflow before returning
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0; // Standard leetcode return for overflow
            }

            return (int) reverse;

        }
}   


/*   public static int reverseHelper(int n){
            if(n==0){ // edge case 1
                return 0;
            }
           int reverse=0;
            while(n>0){
                int lastDigit=n%10;
               reverse =reverse*10+lastDigit;
                n=n/10;
            }
            return reverse;
            modify this function to use long 
            */
           