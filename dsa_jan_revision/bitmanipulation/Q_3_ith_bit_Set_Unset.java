package dsa_jan_revision.bitmanipulation;

public class Q_3_ith_bit_Set_Unset {
    public static void main(String[] args) {
        // n is number and i is the binary bit position of that n;
        int n1=13; int i1=2;
         System.out.println("Evaluating n : "+n1+ " and Position i : "+i1);
        ithBitSetUnsetHelper(n1,i1);

              int n2=9; int i2=2;
         System.out.println("Evaluating n : "+n2+ " and Position i : "+i2);
        ithBitSetUnsetHelper(n2,i2);
        
    }
    public static void ithBitSetUnsetHelper(int n,int i){
           if(n==0){System.out.println("0 is already unset");return ;}

           int mask=1<<i;
           
           if( (n & mask)!=0){
              System.out.println("Bit at index(Position) " + i + " is SET (1)");
           }else{
             System.out.println("Bit at index(Position) " + i + " is UNSET (0)");
           }
    }
}
