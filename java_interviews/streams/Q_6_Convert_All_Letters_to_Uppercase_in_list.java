package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_6_Convert_All_Letters_to_Uppercase_in_list{
    public static void main(String args[]){
          List<String> words=Arrays.asList("ankit","ankush","nikunj","nayan");

          List<String> upperCaseWords=words.stream()
            .map(String::toUpperCase)
          .collect(Collectors.toList());

           System.out.println(" Strings with upperCaseWords are \n"+upperCaseWords);

    }
}
