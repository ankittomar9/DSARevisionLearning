package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_4_Filter_Strings_words_in_a_list {
    public static void main(String args[]){
     List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Anil","ankit","ankush","Nikunj","nayan","Nitin");
                
       List<String> filteredWithPrefix=words.stream()
       .filter(n->n.startsWith("N"))
       .collect(Collectors.toList());
       
 System.out.println("Filtered Strings with Condition are \n"+filteredWithPrefix);

    }
    
}
