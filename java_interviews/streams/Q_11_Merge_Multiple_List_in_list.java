package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_11_Merge_Multiple_List_in_list {
    public static void main(String args[]){
        List<List<Integer>> list=Arrays.asList(
        Arrays.asList(1,2,3),            //list1
          Arrays.asList(7,8,9,10),       //list2
          Arrays.asList(4,5,6)           //list 3
          
    ); 
       System.out.println("Original List \n"+list+"\n"); 
    List<Integer> merged = list.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());

     System.out.println("Merged Flatten List \n"+merged); 

    }
    
}
