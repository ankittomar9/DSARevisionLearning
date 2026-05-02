package dsa_jan_revision.bitmanipulation;

public class Q_6_toggle_a_bit_means_change_it_to_opposite {
    public static void main(String[] args) {
         int n1=13; // 8421 //  1101
        int i1=1;
        ithBitToggleHelper(n1,i1);

        int n2=11; // 8421 // 1011
        int i2=3;
        ithBitToggleHelper(n2,i2);
        
        int n3=8; // 8421 // 1000 
        int i3=0;
        ithBitToggleHelper(n3,i3);
    }
        public static void ithBitToggleHelper(int n,int i){
         System.out.println("\nEvaluating n : "+n+ " and Position i : "+i);
        int mask=1<<i;

        int result= n ^ (mask);
         
        System.out.println("Number after modifying ith Bit : "+result);
    }
}
