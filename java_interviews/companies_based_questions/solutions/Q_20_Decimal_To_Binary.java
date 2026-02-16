package java_interviews.companies_based_questions.solutions;
public class Q_20_Decimal_To_Binary {
    public static void main(String args[]){
        int n=5;

       int result= decimalToBinaryHelper(n);
       System.out.println("Binary of " + n + " is: " + result);
    }
    public static int decimalToBinaryHelper(int n){
        long binary=0;
        long place=1;

        while(n>0){
            int remainder=n%2;

            binary=binary+(remainder * place);
            n=n/2;

            place=place*10;
        }
        return (int) binary;
    }
}
