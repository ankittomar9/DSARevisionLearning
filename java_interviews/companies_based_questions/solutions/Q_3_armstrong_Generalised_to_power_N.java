package java_interviews.companies_based_questions.solutions;

public class Q_3_armstrong_Generalised_to_power_N {
    public static void main(String args[]){
        int n=1634;
        boolean result=checkArmstrong(n);
        if (result) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is NOT an Armstrong Number.");
        }
    }
    public static boolean checkArmstrong(int n){
        if(n<=0){            return false;
        }
        int original_number=n;
        int sum=0;

        int numberofDigits=String.valueOf(n).length();
        while(n>0){
            int lastDigit=n%10;

            sum=(int) (sum+Math.pow(lastDigit, numberofDigits));

            n=n/10;
        }


        return sum==original_number;
    }
}
