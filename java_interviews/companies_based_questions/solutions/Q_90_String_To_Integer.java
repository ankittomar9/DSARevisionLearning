package java_interviews.companies_based_questions.solutions;

public class Q_90_String_To_Integer {
    public static void main(String args[]){
        System.out.println("Result : " + myAtoi("   -42"));
        System.out.println("Result : " + myAtoi("4193 with words"));
        System.out.println("Result : " + myAtoi("999999999999")); 
    }
    public static int myAtoi(String str){
        if(str==null || str.isEmpty()){return 0;}
        int i=0;int n=str.length();
        while(i < n && str.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;

       int sign = 1;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            sign = (str.charAt(i) == '-') ? -1 : 1;  //check and compare
            i++;
        }
        int result = 0;
        while (i < n) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }
            int digit = ch - '0';
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;  //check and compare
            }
            result=(result*10) + digit;
            i++;
        }
        return result * sign;
    }
}
