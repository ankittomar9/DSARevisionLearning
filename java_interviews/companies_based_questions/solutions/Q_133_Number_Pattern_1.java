package java_interviews.companies_based_questions.solutions;

public class Q_133_Number_Pattern_1 {
    public static void main(String args[]){
        int N=5; 
        System.out.println("Number Pattern 1 for N = " + N + ":\n");
        
        printNumberPattern(N);
    }
    public static void printNumberPattern(int N){
        long num=0;

        for(int i=1;i<=N;i++){
            num=(num*10)+i;
              
            System.out.println(num);
          
        }
    }
}
