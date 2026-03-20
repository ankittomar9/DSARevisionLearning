package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_8_ConvertAllLetterstoLowerCase {
    public static void main(String args[]){
        List<String> list=Arrays.asList("STREAM","JAVA","PROGRAMMING");

        List<String> lowerCase=list.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        System.out.println("LowerCase converted List \n"+lowerCase);

    }
    
}
