package java_interviews.companies_based_questions.solutions;
public class Q_95_Roman_To_Integer {
    public static void main(String args[]){
        String str1="LVIII";
        String str2="MCMXCIV";
        System.out.println("Roman '" + str1 + "' -> " + romanToInt(str1));
        System.out.println("Roman '" + str2 + "' -> " + romanToInt(str2));
    }
    public static int romanToInt(String str){
        if(str ==null || str.isEmpty() ){return 0;}
        int total=0;
        for(int i=0;i<str.length();i++){
            int currentValue=getValue(str.charAt(i));

            if(i<str.length()-1 && currentValue < getValue(str.charAt(i+1))){
                total=total-currentValue;
            }else{
                total=total+currentValue;
            }
        }
        return total;
    }
    public static int getValue(char ch){
        switch(ch){
            case 'I': return 1;            case 'V': return 5;            case 'X': return 10;
            case 'L': return 50;            case 'C': return 100;         case 'D': return 500;
            case 'M': return 1000;
            default :return 0;
        }
    }
}
