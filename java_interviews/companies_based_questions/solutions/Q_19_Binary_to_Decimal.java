package java_interviews.companies_based_questions.solutions;
public class Q_19_Binary_to_Decimal {
    public static void main(String args[]){
        int binary=101;

       int result= convertBinaryToDecimal(binary);
        System.out.println("Decimal of " + binary + " is: " + result);
    }
    public static int convertBinaryToDecimal(int n){
        int decimal=0; int base=1;

        while(n>0){
            int lastDigit =n%10;

            decimal=decimal+(base*lastDigit);
            n=n/10;

            base=base*2;
        }
        return decimal;
    }    
}
