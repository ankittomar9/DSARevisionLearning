package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Min_Max {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(2,5,1,7,99,8,5,66,33,4);

        int max=list.stream()
        .max(Integer::compare)
        .orElseThrow();

        System.out.println("Maximum value in list is : \n"+max);

        int min=list.stream()
        .min(Integer::compare)
        .orElseThrow();

         System.out.println("Minimum value in list is : \n"+min);

    }
    
}
