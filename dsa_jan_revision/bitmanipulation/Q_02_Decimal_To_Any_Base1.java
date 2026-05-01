package dsa_jan_revision.bitmanipulation;

public class Q_02_Decimal_To_Any_Base1 {
    public static void main(String[] args) {
        System.out.println("Evaluating Decimal 13 to Base 2(binary):");
        System.out.println("Output: " + solve(13, 2) + "\n");
        
        System.out.println("Evaluating Decimal 37 to Base 8(Octal):");
        System.out.println("Output: " + solve(37, 8) + "\n");
        
        System.out.println("Evaluating Decimal 26 to Base 16 (hexadecimal):");
        System.out.println("Output: " + solve(26, 16));
        
    }
    public static String solve(int A,int B){
        if(A==0){return "0";}
        StringBuilder sb= new StringBuilder();

        while(A>0){
            int remainder=A%B;

            if(remainder<10){
                sb.append((char) (remainder+'0'));
            }else{
                sb.append((char) (remainder-10+'A'));
            }
            A=A/10;
        }
        return sb.reverse().toString();
    }
}
