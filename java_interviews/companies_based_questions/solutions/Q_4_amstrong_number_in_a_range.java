package java_interviews.companies_based_questions.solutions;
import java.util.ArrayList;
import java.util.List;
public class Q_4_amstrong_number_in_a_range {
    public static void main(String args[]){
        /*Goal is to Print armstrong number between 1 to n  */
        int n=1634;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
             boolean result= armstrongHelper(i);
              if (result) {
                list.add(i);
              }
        }
        System.out.println(" Armstrong number between 1 and "+n+ " is : \n "+list );
    }
    public static boolean armstrongHelper(int n){
         if(n<=0){        return false;
        }
        int  original_number=n;
        int sum=0;

        int numberofDigits=String.valueOf(n).length();

        while(n>0){
            int lastDigit=n%10;

            sum= (int) ( sum + Math.pow(lastDigit,numberofDigits));
            n=n/10;
        }

         return sum==original_number;
    }
    
}
