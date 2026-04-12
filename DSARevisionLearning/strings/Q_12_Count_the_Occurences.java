package DSARevisionLearning.strings;

public class Q_12_Count_the_Occurences {
    public static void main(String args[]){
           /*Find the number of occurrences of bob
        in string A consisting of lowercase English alphabets. */
        String str1="abobob"; int k=3;
         System.out.println("original String : \n"+str1);
        countOccurences(str1,k);

          String str2="abobobobobobaabobaabob"; 
         System.out.println("original String : \n"+str2);
        countOccurences(str2,k);

    }
    public static  void countOccurences(String str,int k){
        if(str==null || str.isEmpty()){
            System.out.println("Empty String or null ");return ; }
            int count=0;
            
            for(int i=0;i<=str.length()-k;i++){
                if(str.charAt(i)=='b' && str.charAt(i+1)=='o' && str.charAt(i+2)=='b' ){
                 count++;
                } 
            }
              System.out.println("Number of bob in string are : \n"+count);   
    }
}
