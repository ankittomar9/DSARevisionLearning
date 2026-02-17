package java_interviews.companies_based_questions.solutions;
public class Q_18_Sum_Of_Digits_Digital_root {
    public static void main(String args[]){
        int n=987;
        sumOfDigitsHelper(n);
    }
    public static void sumOfDigitsHelper(int n){
           
            while(n>=10){
                 int sum=0;
                while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
             n=sum;
     }      
        System.out.println("Digital Root is: " + n);
    }
}

/*package java_interviews.companies_based_questions.solutions;
Approach 2
public class Q_18_Digital_Root_Math {
    public static void main(String args[]) {
        int n = 987;
        
        int root = 0;
        if (n == 0) {
            root = 0;
        } else if (n % 9 == 0) {
            root = 9;
        } else {
            root = n % 9;
        }
        
        System.out.println("Digital Root (Math Way) is: " + root);
    }
} */