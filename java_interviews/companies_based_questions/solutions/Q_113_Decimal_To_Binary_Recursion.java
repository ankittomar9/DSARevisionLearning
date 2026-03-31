package java_interviews.companies_based_questions.solutions;

public class Q_113_Decimal_To_Binary_Recursion {
    public static void main(String args[]){
        int n1=10;     
           int n2=13;      
             int n3=0;     
                int n4=5;      
                  int n5=15;

        System.out.println("Binary of " + n1 + " is: " + decimalToBinary(n1));
        System.out.println("Binary of " + n2 + " is: " + decimalToBinary(n2));
        System.out.println("Binary of " + n3 + " is: " + decimalToBinary(n3));
        System.out.println("Binary of " +n4 + " is: " + decimalToBinary(n4));
        System.out.println("Binary of " +n5 + " is: " + decimalToBinary(n5));
    }

   public static String decimalToBinary(int n){
        if(n==0){return "0";}
        return binaryHelper(n);
    }
    public static String binaryHelper(int n){
        if(n==0){return "";}
        String result=binaryHelper(n/2)+(n%2);

        return result;
    }
}
