package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_17_Filter_ODD_EVEN_Using_Map {
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
         System.out.println("Original List \n"+numbers);

        Map<Boolean,List<Integer>>map=numbers.stream()
        .collect(Collectors.partitioningBy(n->n%2==0));

         System.out.println("Partitioned List \n"+map);
    }
    
}
