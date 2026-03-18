package java_interviews.streamsCurrentDay;

import java.util.Arrays;
import java.util.Optional;

public class Q_6_streamAPI_Find_last_Word_in_String {
    public static void main(String args[]){
        String s1 ="I am a Software developer";
        String[] s2=s1.split(" ");

        System.out.println(s1);
        System.out.println(Arrays.toString(s2));

        Optional<String> lastWordOpt=Arrays.stream(s2)
        .reduce((first,second)->second);

        String lastWord=lastWordOpt.orElse("String is Empty");
        System.out.println("The Last Word is : "+lastWord);
    }
}
