package DSARevisionLearning.strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*The Problem: You are given a string A and an integer B. 
You can change at most B characters to any other character.
 Your goal is to minimize the number of distinct characters in the final string. */
public class Q_11_Change_character_greedy {
    public static void main(String args[]){
        String s="abcabbccd"; int B=3;
        
        int freq[]=new int[26];
        int index=0;
        for(int i=0;i<s.length();i++){
           index=s.charAt(i)-'a';
            freq[index]++;
        }    
        System.out.println(Arrays.toString(freq));

          List<Integer>list=new ArrayList<>();
          for(int i=0;i<26;i++){
            if(freq[i]>0){
                list.add(freq[i]);
            }
          }
         Collections.sort(list);
          int distinctCount = list.size(); // Initially 4 distinct chars (a, b, c, d)
        
       for (int i=0; i<list.size(); i++) {
            int count = list.get(i); // Get the value manually
            
            if (B >= count) {
                B = B - count;   // Pay the cost
                distinctCount--; // Reduce distinct count
            } else {
                break; // Stop if budget is too low
            }
        }
          System.out.println("Minimum Distinct Characters: " + distinctCount);
    }
    
}

/*
TC:Time Complexity: O(N) (to read the string) + O(1) (to sort 26 items) = O(N).
SC: O(1)  (fixed array of size 26).
 */