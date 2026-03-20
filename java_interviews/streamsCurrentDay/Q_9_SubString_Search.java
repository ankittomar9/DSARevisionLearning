package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_9_SubString_Search {
    public static void main(String args[]){
        List<String>list=Arrays.asList("java","stream","api","api1,","api2");

        List<String> filtered=list.stream()
        .filter(n->n.contentEquals("api"))
        //.filter(n->n.contains("api")) // will inlcude all letters starting with API
        .collect(Collectors.toList());

        System.out.println("Filtered List : \n"+filtered);

    }
}
