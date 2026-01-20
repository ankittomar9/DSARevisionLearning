package java_interviews.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_8_ConvertallLetterToLowercase {
    public static void main(String args[]){
        List<String> words=Arrays.asList("AMAN","NAMAN","ANKIT","NITIN");

        List<String> lowerCaseConverted=words.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        System.out.println("Uppercase String converted to Lower case \n");
         System.out.println(lowerCaseConverted);

    }
    
}
