package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_9_Filter_list__matching_string {
    public static void main(String args[]){

            List<String> words=Arrays.asList("api","why",
        "learning api","software","build api","coding api"," API coding");

        List<String> filteredWords=words.stream()
        .filter(s->s.contains("api"))
        .collect(Collectors.toList());

        System.out.println("Filtered with condition \n"+filteredWords);
    }
    
}
