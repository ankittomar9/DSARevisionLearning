package java_interviews.streams;

import java.util.Optional;

public class Q_5_Find_Not_Repeated_Characters {
    public static void main(String args[]){
        String s1="icewithiceandnotice";

        Optional<Character> result=s1.chars()
        .mapToObj(ch->(char)ch)
        .filter(ch->s1.indexOf(ch)==s1.lastIndexOf(ch))
        .findFirst();

              System.out.println(" Last Non repeating char \n: "+result);

         

    }
    
}
