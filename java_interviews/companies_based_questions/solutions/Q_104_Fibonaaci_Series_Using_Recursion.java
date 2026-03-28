package java_interviews.companies_based_questions.solutions;

public class Q_104_Fibonaaci_Series_Using_Recursion {
    public static void main(String args[]){
        int n1=6;
        System.out.println("fibonacci Series : "+n1 );
         for(int i=0;i<=n1;i++){
              System.out.print(  fibonacciHelper(i)+" ");
        }
        int n2=9;
        System.out.println("\fibonacci Series : "+n2 );
         for(int i=0;i<=n2;i++){
              System.out.print(  fibonacciHelper(i)+" ");
        }
         int n3=12;
        System.out.println("\fibonacci Series : "+n3 );
         for(int i=0;i<=n3;i++){
              System.out.print(  fibonacciHelper(i)+" ");
        }
    }
    public static long fibonacciHelper(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}

        long result=fibonacciHelper(n-1)+fibonacciHelper(n-2);

        return result;
    }   
}
