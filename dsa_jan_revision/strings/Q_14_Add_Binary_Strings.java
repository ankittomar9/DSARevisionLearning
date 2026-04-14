package dsa_jan_revision.strings;
public class Q_14_Add_Binary_Strings {
    public static void main(String args[]){
        String A="110";String B="10";
         System.out.println("Original String A : "+A);System.out.println("Original String B : "+B);
        addBinaryString(A,B);
    }
    public static void addBinaryString(String A,String B){
        if(A==null || B==null ||A.length()==0 || B.length()==0){
            System.out.println("String is either null or Empty"); return; }
            int i=A.length()-1; int j=B.length()-1;
            int carry=0;
            StringBuilder sb=new StringBuilder();
            while(i>=0 || j>=0 || carry==1 ){
                    int sum=0;    
                if(i>=0){
                        sum=sum+A.charAt(i)-'0';
                    i--;
                    }
                    if(j>=0){
                        sum=sum+B.charAt(j)-'0';
                        j--;
                    }
                    sum=sum+carry;
                      // Compute new carry and result bit
                    carry=sum/2;// 1+1=2 -> carry 1. 1+0=1 -> carry 0.
                    int write=sum%2;// 2%2=0 (write 0). 3%2=1 (write 1).
                    sb.append(write);
            }
             System.out.println("Sum: " + sb.reverse().toString());
    }
}
