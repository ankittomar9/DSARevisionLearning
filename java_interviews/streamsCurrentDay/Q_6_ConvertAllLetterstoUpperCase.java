package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_6_ConvertAllLetterstoUpperCase {
    public static void main(String args[]){
        List<String> list=Arrays.asList("learning","java","0programming");
        
        List<String>upperCase=list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println("UpperCase converted List \n"+upperCase);
    }
}
