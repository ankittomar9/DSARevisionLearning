package java_interviews.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class Q_15_Count_the_Frequency_appearances_of_Characters_a_string {
    public static void main(String args[]){
        String s1="software_development";
        
        Map<Character,Long> frequency=s1.chars()
        .mapToObj(c->(char) c)
         .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

           System.out.println(frequency+"\n");

    }
    
}
