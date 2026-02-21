package java_interviews.companies_based_questions.solutions;
public class Q_6_Check_If_Number_is_Palindrome {
        public static void main(String args[]){
            int n=121;  
             System.out.println("original number : "+n);
            boolean result =palindromeChecker(n);
            
            if(!result){
                System.out.println("Number Given is not Palindrome : \n");
            }else{
                 System.out.println("Number Given is Palindrome : \n ");            }
            }
        public static boolean palindromeChecker(int n){
           if(n<0){ return false;
           }
           if (n >= 0 && n < 10) {
            return true;
        }
           int original_number=n;
           long reverse=0;
            while(n!=0){
                int lastDigit=n%10;
                reverse=reverse*10+lastDigit;
                n=n/10;

            }
            if(reverse> Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
                return false;
            }
                return (int)reverse==original_number;
        }
}
