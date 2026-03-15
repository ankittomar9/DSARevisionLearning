package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_4_Filter_string_with_Prefix {
    public static void main(String args[]){
           List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Avesh","ankit","ankush"
     );

     List<String>prefixFilter=words.stream()
     .filter(n->n.startsWith("A"))
     .sorted(Comparator.reverseOrder())
     .collect(Collectors.toList());

     System.out.println("Name Starting with Reverse : \n"+prefixFilter);

    }
}
