package dsa_jan_revision.bitmanipulation;

public class Q_08_Count_Set_Bits {
    public static void main(String[] args) {
        System.out.println("Evaluating: 11 (Binary: 1011)");
        System.out.println("Set bits counted: " + solve(11) + "\n");

            System.out.println("Evaluating: 11 (Binary: 1001)");
        System.out.println("Set bits counted: " + solve(9) + "\n");

            System.out.println("Evaluating: 11 (Binary: -1)");
            // binary is whole integer  of negative number (Binary: 1111...1111)
        System.out.println("Set bits counted: " + solve(-1) + "\n");
    }
    public static int solve(int n){
        int count=0;

        while(n!=0){
            n= n & (n-1);
            count++;
        }
        return count;
    }
}
