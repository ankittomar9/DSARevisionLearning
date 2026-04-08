package dsa_jan_revision.strings;

import java.util.Arrays;

public class Q_4_Count_Sort {
    public static void main(String args[]){
        String s1="badabczfe";
        System.out.println("Original String  : \n"+s1);
        countSortHelper(s1);
    }
    public static void countSortHelper(String str){
        if(str==null ||  str.isEmpty()){
            System.out.println("Empty String or Null String"); return ;
        }

        int freq[]=new int[26];
        int index=0;

        for(int i=0;i<str.length();i++){
            index=str.charAt(i)-'a';
            freq[index]++;
        }
         System.out.println("Frequency Array \n"+Arrays.toString(freq));

         System.out.print("\nSorted String : \n");
         for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                char c=(char)(i+'a');
                System.out.print(c);
            }
         }
    }
}
