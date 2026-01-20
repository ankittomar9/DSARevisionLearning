package java_interviews.streams;

import java.util.Arrays;
import java.util.List;

public class Q_7_Sum_All_the_numbers_in_list {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer sum=list.stream()
        .mapToInt(Integer::intValue)
        .sum();


         System.out.println("Sum of Numbers in List is : "+sum);

    }
    
}
