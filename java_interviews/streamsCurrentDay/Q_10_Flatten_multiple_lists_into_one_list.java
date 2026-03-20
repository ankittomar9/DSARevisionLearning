package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_10_Flatten_multiple_lists_into_one_list {
    public static void main(String args[]){
        List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8,9),
                Arrays.asList(10,11,12,13)
    );

    List<Integer> flatList=list.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());
    System.out.println("Flattened List is \n"+flatList);
    }
}
