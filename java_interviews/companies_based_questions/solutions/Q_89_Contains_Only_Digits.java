package java_interviews.companies_based_questions.solutions;

public class Q_89_Contains_Only_Digits {
  public static void main(String args[]){
     String str1="1234567890";
     String str2="123abc56";
     String str3="99999999999999999999999999999";
     System.out.println("" + str1 + " only digits? " + isNumeric(str1));
         System.out.println("" + str2 + " only digits? " + isNumeric(str2));
              System.out.println("" + str3 + " only digits? " + isNumeric(str3));
  
    }  
        public static boolean isNumeric(String str){
            if(str== null || str.isEmpty()){return false;}
        
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
       
                if(ch <'0' || ch>'9'){
                    return false;
                }       
        }
        return true;
        }
}
