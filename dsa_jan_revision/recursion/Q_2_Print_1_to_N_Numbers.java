package dsa_jan_revision.recursion;

public class Q_2_Print_1_to_N_Numbers {
    public static void main(String[] args) {
        int n = 10;
System.out.print("Printing Numbers from 1 to " + n + "\n");
        print1_to_N_numbers_helper(n);
    }
    public static void print1_to_N_numbers_helper(int n){
        if(n<=0){ return ;}
    
        print1_to_N_numbers_helper(n-1);
          System.out.print(" "+n);
    
    }
}
