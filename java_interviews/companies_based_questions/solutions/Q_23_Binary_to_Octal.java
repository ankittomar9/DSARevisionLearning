package java_interviews.companies_based_questions.solutions;
public class Q_23_Binary_to_Octal{ 
    public static void main(String args[]){
        int binary=101001;
/*Convert a Binary number (Base 2) to an Octal number (Base 8).
        Input: 101001 (Binary)Bridge (Decimal):
        32 + 8 + 1 = 41 Output: 51 (Octal) */
        int decimal =convertBinaryToDecimal(binary);

        int octal= convertDecimalToOctal(decimal);
        System.out.println("Binary " + binary + " in Octal is: " + octal);
    }
    public static int convertBinaryToDecimal(int n){
        int decimal=0;
        int base=1;

        while(n>0){
            int lastDigit=n%10;
            decimal=decimal+(lastDigit*base);
            n=n/10;
            base=base*2;
        }
        return decimal;
    }
    public static int convertDecimalToOctal(int n){
        int octal=0;
        int place=1; 
    
        while(n>0){
            int remainder=n%8;
            octal=octal +(remainder *place);
            n=n/8;
            place=place*10;
        }
        return octal;
    }
    
}
