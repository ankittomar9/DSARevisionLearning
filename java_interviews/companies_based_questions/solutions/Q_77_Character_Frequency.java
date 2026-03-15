package java_interviews.companies_based_questions.solutions;

public class Q_77_Character_Frequency {
    public static void main(String args[]){
        String input="banana";

        System.out.println("String  : "+input);
        System.out.println("Frequencies : ");
        calculateFrequency(input);
    }
    public static void calculateFrequency(String str){
        if(str== null || str.isEmpty()){return ;}
        int freqArr[]=new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            freqArr[ch]++;
        }

        for( int i=0;i<256;i++){
            if(freqArr[i]>0){
                System.out.print((char) i + ": "+ freqArr[i]+"\n");
            }
        }
    }
}
