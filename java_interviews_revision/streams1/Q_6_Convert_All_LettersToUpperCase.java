package java_interviews_revision.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_6_Convert_All_LettersToUpperCase {
    public static void main(String args[]){
        List<String> words= Arrays.asList("java","stream","interviews");
        System.out.println("Original List is \n"+words);

        List<String> list=words.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        System.out.println("Converted List is \n"+list);
    }
}
