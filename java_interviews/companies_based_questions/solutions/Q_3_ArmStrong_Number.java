package java_interviews.companies_based_questions.solutions;
public class Q_3_ArmStrong_Number {
    public static void main(String args[]){
        int n=153; // check for 121 153 
        boolean result=armsStrongHelper(n);   
        if(!result){
            System.out.println("Given number is not an armstrong number \n"+n);
        }else{
                System.out.println("Given number is an armstrong number \n"+n);
        }
    }
    public static boolean armsStrongHelper(int n){
        if(n<=0){        return false;
        }
            int original_Number=n;            int sum=0;
            while(n>0){
                int lastDigit=n%10;
                sum=sum+(lastDigit*lastDigit*lastDigit);
             
               // sum=(int) (sum+Math.pow(lastDigit, n)); 
                n=n/10;
            }
            return sum==original_Number;
    }
}
