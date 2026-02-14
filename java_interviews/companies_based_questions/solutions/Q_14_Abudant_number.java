package java_interviews.companies_based_questions.solutions;

public class Q_14_Abudant_number {
    public static void main(String args[]){
        /*A number is Abundant if the sum of its proper divisors is greater than the number itself.
        12: Divisors are 1, 2, 3, 4, 6.Sum: 1 + 2 + 3 + 4 + 6 = 16.Since 16 > 12, it is Abundant
        .10: Divisors are 1, 2, 5.Sum: 1 + 2 + 5 = 8.Since 8 < 10, it is Deficient (Not Abundant).
        */
       int n=12;
        abundant_Number_Helper(n);
    }
    public static void abundant_Number_Helper(int n){
        if(n<=0){
            System.out.println("Invalid Input"); return;       }

        int original_Number=n;
        int sum=0;

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
          //System.out.println(sum);
        if(sum>original_Number){
            System.out.println(n+" is abundant number ");
        }else{
             System.out.println(n+" is not an  abundant number ");
        }
    }
    
}
