package dsa_jan_revision.recursion;

public class Q_1_Print_N_to_1_Numbers {
    public static void main(String[] args) {
        int n=10;
System.out.print(" Printing Numbers from "+n+" to 1 \n");
        printN_To_1_Numbers_Helper(n);
    }
    public static void printN_To_1_Numbers_Helper(int n){
        if(n==0){
            return;
        }
        System.out.print(" "+n);
        printN_To_1_Numbers_Helper(n-1);

    }
}
