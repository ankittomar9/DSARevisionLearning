package java_interviews.streams;

import java.util.Arrays;
import java.util.List;

public class Q_12_Concatenate_multiple_string_words {
    public static void main(String args[]){
               List<String> list=Arrays.asList("Software","Engineer","is",
        "interesting","to","learn");
           System.out.println("Original Words \n"+list+"\n");

        String concatenated_into_sentence=list.stream()
        .reduce("",(s1,s2)->s1+" "+s2).trim();
        

        System.out.println("New String : \n"+concatenated_into_sentence);
    }
    
}
