package java_interviews.companies_based_questions.solutions;
public class Q_10_Check_if_a_number_is_a_Strong_Number {
    /*A number is called a Strong Number (or Krishnamurthy Number)
     if the sum of the factorials of its digits equals the number itself.
     Example (145):1! = 1 , 4! = 24 , 5! = 120 , Sum: 1 + 24 + 120 = 145. ) */
    public static void main(String args[]){
        int n=145; // check for other numbers as well 
        strongNumberChecker(n);
    }
    public static void strongNumberChecker(int n){
        if (n == 0) {
        System.out.println(n + " is NOT a Strong Number");       return;    }
       int originalNumber=n;
       int sum=0;
        while(n>0){
         int extract =n%10;
       
        int fact=1;
        for(int i=1;i<=extract;i++){
            fact=fact*i;
        }
        sum=sum+fact;
       
            n=n/10;
       }
       if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number");
        }
    }
}

/*TC : O(log(n))
    SC: O(1)
*/