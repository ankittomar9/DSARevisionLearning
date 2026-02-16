package java_interviews.companies_based_questions.solutions;

public class Q_21_Octal_to_Decimal {
    public static void main(String args[]){
        int octal=157;

        int result= octalToDecimalHelper(octal);
        System.out.println("Decimal of " + octal + " is: " + result);
    }
    public static int octalToDecimalHelper(int n){
        int decimal=0; int base=1;

        while(n>0){
            int lastDigit =n%10;

            decimal=decimal+(base*lastDigit);
            n=n/10;

            base=base*8;
        }
        return decimal;
    }
}
