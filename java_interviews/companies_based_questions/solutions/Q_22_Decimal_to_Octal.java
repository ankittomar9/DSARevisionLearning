package java_interviews.companies_based_questions.solutions;
public class Q_22_Decimal_to_Octal {
    public static void main(String args[]){
        int decimal=111;
        // output Octal = 157
        /*Convert a Decimal number to Octal.
        - **Input:** `111` (Decimal)
        - **Process:** Divide by 8, keep remainders.
        - **Output:** `157` (Octal) */

        decimalToOctalHelper(decimal);
    }
    public static void decimalToOctalHelper(int n){
        long octal=0; int original_Number=n;
        long place=1;
        while(n>0){
             int remainder = n%8;

            octal=octal+(remainder*place);
            n=n/8;

            place=place*10;
        }
               System.out.println("Octal of  " + original_Number +  " is : "+octal);
    }
}
