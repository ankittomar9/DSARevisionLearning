package java_interviews.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q_10_Find_Duplicates_in_List {
    public static void main(String args[]){
        //
    List<Integer> numbers=Arrays.asList(1,4,2,3,6,7,2,1,3,6);    

    Set<Integer> unique=new HashSet<>();

         Set<Integer> duplicates=numbers.stream()
         .filter(n->!unique.add(n))
         .collect(Collectors.toSet());

          System.out.println("Original List \n"+ numbers);
       System.out.println("Duplicate Elements \n"+ duplicates);

    }
    
}
