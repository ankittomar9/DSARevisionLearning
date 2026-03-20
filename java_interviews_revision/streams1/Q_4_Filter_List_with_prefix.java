package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_4_Filter_List_with_prefix {
    public static void main(String args[]){
        List<String> words=Arrays.asList("Aman","Anuj","Naman","NoName","Surname"
                ,"MyName","Avesh","ankit","ankush"
     );
         System.out.println("Original  List \n"+words);
     List<String> filteredList=words.stream()
     .filter(n->n.contains("A"))
     .collect(Collectors.toList());

     System.out.println("Filtered List \n"+filteredList);

    }
}
