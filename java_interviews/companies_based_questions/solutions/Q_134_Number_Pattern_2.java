package java_interviews.companies_based_questions.solutions;

public class Q_134_Number_Pattern_2 {
     public static void main(String args[]){
        int N=5; 
        System.out.println("Number Pattern 2 for N = " + N + ":\n");
        
        printNumberPattern(N);
    }
    public static void printNumberPattern(int N){
        long base=0;

        for(int i=1;i<=N;i++){
            base=(base*10)+1;
              
            System.out.println(base*i);
          
        }
    }
}
