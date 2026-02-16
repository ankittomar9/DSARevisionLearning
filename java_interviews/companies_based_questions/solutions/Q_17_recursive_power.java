package java_interviews.companies_based_questions.solutions;

public class Q_17_recursive_power {
    public static void main(String args[]){
        int a=2;
        int b=5;
      int result=  powerHelper(a,b);
         System.out.println("Power of a^n is : \n"+result);

    }
    public static int powerHelper(int a,int b){
        if(b==0){
            return 1;
        }
        if(b<0) return -1;
        
        int result =powerHelper(a,b-1)*a;
            return result;
    }
    
}
