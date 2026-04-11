package DSARevisionLearning.strings;
public class Q_9_isalnum_Check_String_has_only_alphaNumeric {
    public static void main(String args[]){
         String str1="ankitlearnswell"; System.out.println("Original String \n"+str1);
         alphaNumericHelper(str1);
        String str2="Ankit@learns_java";System.out.println("Original String \n"+str2);
        alphaNumericHelper(str2);
    }
    public static void alphaNumericHelper(String str){
        if(str==null || str.isEmpty()){System.out.println("Stringis empty or null");return;}
      //  char arr[]=str.toCharArray();
        boolean isViolated=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' ||
                ch>='A' && ch<='Z' ||
                ch>='0' && ch<='9'){
                    continue;
            }else{
                isViolated=true;
                 System.out.println("String has special character : "+ch+" at index: " +i);
                break;
            }
        }
        if(!isViolated){
             System.out.println("String Only Consists of AlphaNumeric Characters");
        }     
    }
}
