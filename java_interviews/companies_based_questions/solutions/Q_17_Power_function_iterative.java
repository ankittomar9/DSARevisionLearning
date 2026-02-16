package java_interviews.companies_based_questions.solutions;

public class Q_17_Power_function_iterative {
    public static void main(String args[]){
        int a=10; int b=2;
        //Output a^b 2^5 =32
        //Output a^b 10^2 =100
            powerHelper(a,b);
    }
    public static void powerHelper(int a,int b){
        if(b==0){
            System.out.println(1);return;
        }
       
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }

       System.out.println("Power of a^n is : \n"+power);
    }
}
