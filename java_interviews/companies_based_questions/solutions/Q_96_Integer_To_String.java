package java_interviews.companies_based_questions.solutions;

public class Q_96_Integer_To_String {
    public static void main(String args[]){
         System.out.println("Result: " + intToString(1234));
        System.out.println("Result: " + intToString(-42));
        System.out.println("Result: " + intToString(0));
    }
    public static String intToString(int num){
        if(num==0){    return "0";        }
    
        StringBuilder sb= new StringBuilder();
        boolean isNegative =false;
        if(num<0){
            isNegative=true;
            num=-num;
        }

       while(num>0){
            int digit =num%10;
            sb.append((char)(digit+'0'));
            num=num/10;
        }

        if(isNegative){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
