package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.List;

public class Q_3_Find_Min_Max {
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(4,33,55,99,88,24,3);

        int max=list.stream()
        .max(Integer::compare)
        .orElseThrow();

        System.out.println("Max Element from List is \n"+max);

         int min=list.stream()
        .min(Integer::compare)
        .orElseThrow();

        System.out.println("Min Element from List is \n"+min);


    }
}
