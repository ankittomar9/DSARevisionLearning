package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;

public class Q_7_Sum_Of_All_number_in_List {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(1,2,3,4,5);

        double sum=list.stream()
        .mapToDouble(Integer::intValue)
        .sum();
        
        System.out.println("Sum of All elements in List \n"+sum);
    }
    
}
