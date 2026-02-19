package java_interviews.companies_based_questions.solutions;
public class Q_11_Check_if_a_number_is_a_Perfect_Number {
    public static void main(String args[]){
        /*A number is Perfect if the sum of its divisors
         (excluding the number itself) equals the number. */
           // int n=28;/* 1 + 2 + 4 + 7 + 14  */ // Try 6, 28, 496, 8128
            int n=28;
            perfectNumberHelper(n);
        }
        public static void perfectNumberHelper(int n){
            if(n<=1){
              System.out.println(n + " is NOT a Perfect Number"); return ;            }
              
              int sum=0;      // why n/2 suppose the number is 
              // 28 we cannot include 28 so the last factor we can include is n/2 which 28/2 which 14
              for(int i=1;i<=n/2;i++)   {
                    if(n%i==0){
                        sum=sum+i;
                    }                   
              }
              if (sum == n) {
                            System.out.println(n + " is a Perfect Number");
              } else { 
                  System.out.println(n + " is NOT a Perfect Number");
               }
    }
    
}
