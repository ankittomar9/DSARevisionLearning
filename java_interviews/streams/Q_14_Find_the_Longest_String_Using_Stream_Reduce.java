package java_interviews.streams;

import java.util.Arrays;
import java.util.List;

public class Q_14_Find_the_Longest_String_Using_Stream_Reduce {
    public static void main(String args[]){
  List<String> words
    =Arrays.asList("Java","Features","Streams","Lambdas","Development");

     String longestWord=words.stream()
       .reduce((s1,s2)->s1.length()>s2.length()? s1:s2)
        .orElse("List is Empty");

          System.out.println(" Maximum length word : \n"+longestWord);


    }
    
}
