package java_interviews.companies_based_questions.solutions;
public class Q_1_Check_if_number_is_Prime {
    public static void main(String args[]){
        int n=19; 
        /*Prime number is a number which has exactly two factors 
         1 and the number itself */
        boolean isPrime=primeHelper(n);
        if(isPrime){
            System.out.println("Given number is a prime : \n "+n);
        }else{
             System.out.println("Given number is not prime : \n "+n);
        }
    }
    public static boolean primeHelper(int n){
        if(n<=0){ System.out.println("Invalid Input or Negative number(Invalid input)"); 
            return false;}
        int factorsCount=1; 
        for(int i=2;i<n;i++){  // why not i<=n because n/n which is true
            if(n%i==0){
                factorsCount++;
                return false;
            }
        }
       return true;
    }
    
}
