package DSARevisionLearning.strings;
public class Q_8_Longest_Common_Prefix {
/*Given the array of strings A, you need to find the longest string S, 
which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest
 string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".   */
    public static void main(String args[]){
    //     String arr[] = {"abcdefgh", "abcefgh", "abcdgg","abchhf","dfaabc","dfabcef"};//returns empty
        String arr[] = {"abcdefgh", "abcefgh", "abcdgg","abchhf"};
        longestPrefixHelper(arr);
    }
    public static void longestPrefixHelper(String arr[]){
        if(arr==null || arr.length==0){System.out.println("String arr is empty");return;}
        String prefix=arr[0];

        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    System.out.println("Common Prefix: (empty)");
                    return;
                }
            }   
        }
          System.out.println("Longest Common Prefix: " + prefix);
    }
}
