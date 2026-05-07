package dsa_jan_revision.bitmanipulation;

public class Q_22_Strange_Equality {
    public static void main(String[] args) {
        int A1=5; System.out.println("Evaluating A: " + A1
         + " (Binary: " + Integer.toBinaryString(A1) + ")");
        System.out.println("Final XOR of X and Y: " + solve(A1));

          int A2=10;          System.out.println("Evaluating A: " + A2 
          + " (Binary: " + Integer.toBinaryString(A2) + ")");
        System.out.println("Final XOR of X and Y: " + solve(A2));
    }
    public static int solve(int A){
        if (A==0) return 1;     if (A<0) return 0;
        int temp =A;        int bitCount =0;

        while(temp>0){
            bitCount++;
            temp=temp>>1;
        }
        int mask =(1<< bitCount)-1;
        int X=A^ mask;

        int Y=1 << bitCount;
        return X^Y;
    }
}
