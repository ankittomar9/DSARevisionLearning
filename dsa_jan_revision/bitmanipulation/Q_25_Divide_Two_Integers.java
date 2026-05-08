package dsa_jan_revision.bitmanipulation;
public class Q_25_Divide_Two_Integers {
    public static void main(String[] args) {
         int dividend1 = 22, divisor1 = 3;
        System.out.println("Evaluating " + dividend1 + " / " + divisor1);
        System.out.println("Quotient: " + solve(dividend1, divisor1) + "\n");
        
        int dividend2 = Integer.MIN_VALUE, divisor2 = -1;
        System.out.println("Evaluating " + dividend2 + " / " + divisor2);
        System.out.println("Quotient: " + solve(dividend2, divisor2));
    }
    public static int solve(int dividend ,int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1){ return Integer.MAX_VALUE;      }
        boolean isNegative =(dividend < 0) ^ (divisor < 0);
        long absDividend =Math.abs((long) dividend);
        long absDivisor =Math.abs((long) divisor);

        int quotient=0;
        while(absDividend >= absDivisor){
            long tempDivisor = absDivisor;
            long multiple =1;

            while(absDividend >= (tempDivisor << 1)){
                tempDivisor = tempDivisor <<1;
                multiple =multiple <<1;
            }
            absDividend = absDividend -tempDivisor;
            quotient = (int) (quotient + multiple);
        }
        return isNegative ? -quotient : quotient;
    }
}
