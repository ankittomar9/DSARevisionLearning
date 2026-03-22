package dsa_jan_revision.arrayBasics;

public class Q_17_Arrays_a_b_pairs_optimized {
    public static void main(String args[]){
        String s1 = "dcabbaab";
        abPairHelper(s1);
    }
    public static void abPairHelper(String str){
         if(str==null || str.isEmpty()){return ;}

         int aCount=0;
         int totalPairs=0;

         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch =='a'){
                aCount++;
            }else if(ch=='b'){
                totalPairs=totalPairs+aCount;
            }
         }
        System.out.println("Total count of (a, b) pairs: \n" + totalPairs);
    }
}
