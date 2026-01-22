package java_interviews.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q_13_Find_the_Longest_string_in_given_List_Of_string {
    public static void main(String args[]){
        List<String> words
        =Arrays.asList("Java","Features","Streams","Lambdas");

        String longestWord=words.stream()
        .max(Comparator.comparingInt(String::length))
        .orElse("List is Empty");

          System.out.println(" Maximum length word : \n"+longestWord);
    }
}
