package java_interviews.companies_based_questions.solutions;
public class Q_12_Automorphic_number {
    public static void main(String args[]){
        /* An Automorphic Number is a number whose square ends with the number itself.
        5  5^2 = 25 (Ends with 5) ✅
              25  25^2 = 625 (Ends with 25)       ✅ 
         7   7^2 = 49 (Ends with 9) no ❌ */
            int n=7;
           boolean result=  automorphic_number_checker(n);

            if (result) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is NOT an Automorphic Number.");
        }
    }
    public static boolean automorphic_number_checker(int n){
        if(n<0 ){            System.out.println(0);return false;        }

        long square =(long) n*n;

        while(n>0){
          int extract1= n%10; 
          long extract2 = square % 10;

          if(extract1 !=extract2){
            return false;
          }
          n=n/10;
          square=square/10;
        }
        return true;
    }    
}

/*TC : O(Logn) reducing the number
    SC: O(1) not extra space used
*/