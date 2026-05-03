package dsa_jan_revision.bitmanipulation;

public class Q_8_Count_number_of_set_bits {
    public static void main(String[] args) {
       int n1=11; //8421 // 1011 there are 3 set bits
        System.out.println("Original Number : \n"+n1);
        countSetBitsHelper(n1);
          int n2=9; // 8421 //  1001
           System.out.println("Original Number : \n"+n2);
        countSetBitsHelper(n2);
    }
    public static void countSetBitsHelper(int n){
        int count =0;
        //why 32 because integer has 32 
        int n2=n;
        for(int i=0;i<32;i++){
           int mask=1<<i;
            if((n & mask )!=0){
                count++;
            }
        }
          System.out.println("Count of Set bits are : \n"+count);
          //approach 2
            int count2=0;
            while(n2>0){
                if((n2 & 1)!=0){
                    count2++;
                }
                n2=n2>>1;
            }
             System.out.println("Count of Set bits are : \n"+count2);
    }
}
