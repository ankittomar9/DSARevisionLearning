package java_interviews.companies_based_questions.solutions;

public class Q_86_String_Rotation {
    public static void main(String args[]){
        String str1= "ABCD";
        String str2="CDAB";
        String str3="ACBD";

         System.out.println("Are '" + str1 + "' and '" 
         + str2 + "' rotations? " + isRotation(str1, str2));
        System.out.println("Are '" + str1 + "' and '" 
        + str3 + "' rotations? " + isRotation(str1, str3));
    }
    public static boolean isRotation(String str1,String str2){
        if(str1 == null || str2 ==null || str1.length() != str2.length()){
            return false;
        }
        String duplicated =str1+str1;

        return duplicated.contains(str2);
    }

}
