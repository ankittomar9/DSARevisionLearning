package java_interviews.streamsCurrentDay;

import java.util.Optional;

public class Q_5_Find_Non_Repeated {
    public static void main(String args[]){
        String s1="ookkeepeer";

        Optional<Character> firstNonRepeated=s1.chars()
        .mapToObj(ch->(char)ch)
        .filter(ch->s1.indexOf(ch)==s1.lastIndexOf(ch))
        .findFirst();

        System.out.println("Non Reapeted character" +firstNonRepeated);

    }
}
