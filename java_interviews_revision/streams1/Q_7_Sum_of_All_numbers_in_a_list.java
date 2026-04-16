package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.List;

public class Q_7_Sum_of_All_numbers_in_a_list {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        System.out.println("Original List is \n"+list);
        double sum=list.stream()
        .mapToDouble(Integer::intValue)
        .sum();

      System.out.println ("Sum of All Number in List is \n"+sum);
    }
}
