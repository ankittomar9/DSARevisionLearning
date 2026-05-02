package dsa_jan_revision.bitmanipulation;

public class Q_4_Set_ith_Bit {
    public static void main(String[] args) {
        int n1=9; // 8421 //  1001
        int i1=1;
        ithBitSetHelper(n1,i1);

        int n2=13; // 8421 // 1101 
        int i2=2;
        ithBitSetHelper(n2,i2);
        
        int n3=8; // 8421 // 1000 
        int i3=3;
        ithBitSetHelper(n3,i3);
        
    }
    public static void ithBitSetHelper(int n,int i){
         System.out.println("\nEvaluating n : "+n+ " and Position i : "+i);
        int mask=1<<i;

        int result= n | mask;
         
        System.out.println("Number after modifying ith Bit : "+result);
    }
}
