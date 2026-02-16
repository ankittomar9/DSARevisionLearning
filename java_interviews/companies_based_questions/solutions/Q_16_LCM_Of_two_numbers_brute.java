package java_interviews.companies_based_questions.solutions;

public class Q_16_LCM_Of_two_numbers_brute{
    public static void main(String args[]){
        int a=12;
        int b=15;
        lcm_helper(a,b);
    }

    public static void lcm_helper(int a ,int b){
        if (a == 0 || b == 0) {
            System.out.println("LCM is 0");
            return;
        }

       int lcm=0;
       int range=a*b;
        for(int i=1;i<=range;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of "+a+" and "+b+ " is : \n" +lcm);
    }
}
