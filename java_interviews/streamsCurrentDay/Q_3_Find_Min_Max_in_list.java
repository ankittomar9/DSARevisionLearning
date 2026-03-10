package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Min_Max_in_list {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(12,11,1,4,6,8,4,9,88,45,7);

        int max=list.stream()
        .max(Integer::compare)
        .orElseThrow();
        System.out.println("Max in list is : "+max);
        
        int min=list.stream()
        .min(Integer::compare)
        .orElseThrow();

        System.out.println("Max in list is : "+min);

    }

}
