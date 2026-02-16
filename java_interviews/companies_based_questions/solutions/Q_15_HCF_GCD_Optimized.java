package java_interviews.companies_based_questions.solutions;

public class Q_15_HCF_GCD_Optimized {
    public static void main(String args[]){
        int a=20;
        int b=30;
        int result=hcd_gcd_helper(a,b);
        System.out.println(" GCD of " +a+ " and " +b+ " is \n"+result);
    }
    public static int hcd_gcd_helper(int a,int b){

        while(b!=0){
            int remainder=a%b;

            a=b;
            b=remainder;
        }

        return Math.abs(a);
    }
    
}
