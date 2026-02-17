package java_interviews.companies_based_questions.solutions;
public class Q_18_Sum_Of_Digits_Iterative {
    public static void main(String args[]){
        int n=984;
        sumDigitsHelper(n);
    }
    public static void sumDigitsHelper(int n){
         n=Math.abs(n); // for negative test case
        if(n==0){
            System.out.println(0);return;        }

        int sum=0;
        while(n>0){
              int extract=n%10;
              sum=sum+extract;

              n=n/10;
        }
      System.out.println("Sum of Digits is : \n"+sum);
    }    
}
