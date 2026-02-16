package java_interviews.companies_based_questions.solutions;

public class Q_16_LCM_of_two_numbers_optimized {
    public static void main(String args[]){
        int a=12;// 
        int b=15; // 

        int lcm=findLcm(a,b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static int findLcm(int a,int b){
        if(a==0 || b==0) return 0;

        int gcd=gcd(a,b);
        int result= Math.abs((a*b)/gcd);
        return result;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
}
