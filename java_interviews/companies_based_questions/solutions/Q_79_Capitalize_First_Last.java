package java_interviews.companies_based_questions.solutions;

public class Q_79_Capitalize_First_Last {
    public static void main(String args[]){
        String s1="java programming";
        String s2 ="a new stream program";
        System.out.println("Original: " + s1);
        System.out.println("Modified: " + capitalizeFirstAndLast(s1));
         System.out.println("Original: " + s2);
        System.out.println("Modified: " + capitalizeFirstAndLast(s2));
    }
    public static String capitalizeFirstAndLast(String str){
        if(str == null || str.trim().isEmpty()){return str;}

        char chars[]=str.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                continue;
            }

            if(i==0 || chars[i-1]==' '){
                chars[i]=Character.toUpperCase(chars[i]);
            }

               if(i==chars.length-1 || chars[i+1]==' '){
                chars[i]=Character.toUpperCase(chars[i]);
            }
        }
         return new String(chars);
    }
}
