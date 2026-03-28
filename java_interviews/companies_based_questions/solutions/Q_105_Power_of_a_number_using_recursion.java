package java_interviews.companies_based_questions.solutions;

public class Q_105_Power_of_a_number_using_recursion {
    public static void main(String args[]){
        int a1=2;int n1=5;
        long result=powerHelper(a1,n1);
        System.out.println(  a1 + " to the power of " + n1 + " is: "+result);

         int a2=5;int n2=3;
        long result2=powerHelper(a2,n2);
    
       System.out.println(  a2 + " to the power of " + n2 + " is: "+result2);
        
         int a3=3;int n3=4;
        long result3=powerHelper(a3,n3);
     System.out.println(  a3 + " to the power of " + n3 + " is: "+result3);
        
        
    }
    public static long powerHelper(int a,int n){
        if(n==0){ return 1;} 

        long result=powerHelper(a, n-1)*a;

        return result;
    }
}
