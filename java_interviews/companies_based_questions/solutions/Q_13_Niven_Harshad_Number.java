package java_interviews.companies_based_questions.solutions;

public class Q_13_Niven_Harshad_Number {
    /*A number is a Harshad (or Niven) Number if it is divisible by the sum of its digits. */
    public static void main(String args[]){
        int n=18;
        boolean result=sum_digits_helper(n);

        if (result) {
            System.out.println(n + " is a Harshad Number.");
        } else {
            System.out.println(n + " is NOT a Harshad Number.");
        }
        
    }
    public static  boolean sum_digits_helper(int n){
        int originalNumber=n;
        int sum=0;
        while(n>0){
            int digit=n%10;

            sum=sum+digit;
            n=n/10;
        }
        boolean result= originalNumber % sum==0;
        return result;
    }
}

/*TC: O(Logn)
    SC: O(1)
*/