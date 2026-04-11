package DSARevisionLearning.strings;
public class Q_13_Check_given_Strings_are_anagrams {
    public static void main(String args[]){
    /*Two strings are Anagrams if they contain the exact same characters with 
    the exact same frequencies,   just in a different order (e.g., "silent" and "listen"). */
            String s1="listen";String s2="silent";  // String s2="silena"; for test negative case
                checkAnagramsHelper(s1,s2);
    }
    public static void checkAnagramsHelper(String str1,String str2){
if(str1==null || str2==null || str1.isEmpty() || str2.isEmpty()){
          System.out.println("String is empty or null"); return;}
if(str1.length()!=str2.length()){System.out.println("String lengths different not anagrams");return;}          

          int freq[]=new int[26];
          int index=0;
    
          for(int i=0;i<str1.length();i++){
            index=str1.charAt(i)-'a';
            freq[index]++;
          }
          for(int i=0;i<str2.length();i++){
            index=str2.charAt(i)-'a';
            freq[index]--;
          }
          for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("Given Strings are Not Anagrams");
                return;  
            }
          }
         System.out.println("Strings are Anagrams"); 
        }

    }

