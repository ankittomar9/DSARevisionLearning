package dsa_jan_revision.arrayBasics;

public class Q_17_Arrays_a_b_pairs_brute {
     //Given a String/char array of lowercase a and b 
   //Find the count of pairs(i,j) such that i<j and arr[i]=a and arr[j]=b 
    public static void main(String args[]){
          String s1="dcabbaab";
          abPairHelper(s1);
    }
    public static void abPairHelper(String str){
        if(str==null || str.isEmpty()){return ;}

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a' ){
                continue;
            }
            for(int j=i+1;j<str.length();j++){
                if( str.charAt(j)=='b'){
                   System.out.println("Pair are : ( "+str.charAt(i)+ ","+ str.charAt(j)+")"); 
                count++;
            }
            }
        }
        System.out.println("count of pairs are : \n"+count);
    }
}
