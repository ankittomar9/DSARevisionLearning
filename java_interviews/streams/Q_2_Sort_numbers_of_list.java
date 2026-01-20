package java_interviews.streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q_2_Sort_numbers_of_list {
    public static void main(String args[]){
        List<Integer> numbers=Arrays.asList(4,7,5,8,6,9,3,1,2);
        System.out.println("\nOriginal UnSorted List \n"+numbers);

        List<Integer> ascSortedList=numbers.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
        System.out.println("\nAscending Sorted List \n"+ascSortedList);
        
        List<Integer> descSortedList=numbers.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

        System.out.println("\nDescending Sorted List \n"+descSortedList);


    }
    
}
