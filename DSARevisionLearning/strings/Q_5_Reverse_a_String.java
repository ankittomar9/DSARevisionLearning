package DSARevisionLearning.strings;

public class Q_5_Reverse_a_String {
    public static void main(String args[]){
        String s1="sky_is_blue";

        System.out.println("Original String \n"+s1);
          if(s1==null || s1.length()==0)
    {System.out.println("Empty String or Null String");return; }

        String s2="";
        int n=s1.length();

        for(int i=n-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
               System.out.println("Reversed String \n"+s2);
    }
    
}
/*      Iteration 1: Copy 1 char.
        Iteration 100: Copy 100 chars.
        Iteration 1000: Copy 1000 chars.
        TC:Total Time Complexity: O(N^2) (Quadratic Time). 
         SC:O(N) 
*/ 