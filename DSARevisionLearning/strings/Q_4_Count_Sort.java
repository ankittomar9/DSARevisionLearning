package DSARevisionLearning.strings;
import java.util.Arrays;
public class Q_4_Count_Sort {
    public static void main(String args[]){
         String s1="badabczfe";         //Sort the string like aabbcdefz
         System.out.print("Original String : \n"+s1);

    if(s1==null || s1.length()==0)
    {System.out.println("Empty String or Null String");return; }

        //step 1: Create a frequency array of String
        int freq[]=new int[26];
        int index=0;
        for(int i=0;i<s1.length();i++){
            index=s1.charAt(i)-'a';
            freq[index]++;
        }
          System.out.println("Frequency Array \n"+Arrays.toString(freq));
        //step 2:sort based on frequency
           System.out.print("\nSorted String : \n");
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                char c=(char)(i + 'a');
                System.out.print(c);
            }
        }
    }    
}
