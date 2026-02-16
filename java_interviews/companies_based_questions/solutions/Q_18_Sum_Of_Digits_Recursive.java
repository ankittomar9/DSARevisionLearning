package java_interviews.companies_based_questions.solutions;

public class Q_18_Sum_Of_Digits_Recursive {
    public static void main(String args[]){
        int n=354;
       int  result=digits_helper_Recursive(n);

       System.out.println("Sum of Digits is : \n"+result);
    }

    public static int digits_helper_Recursive(int n){
        if(n<=0){            return 0;
        }
        int extract=n%10;
        int sum=0;
        sum=sum+extract;
        int reduce=n/10;

        int result=digits_helper_Recursive(reduce);

        return result+sum;
    }

    
}
