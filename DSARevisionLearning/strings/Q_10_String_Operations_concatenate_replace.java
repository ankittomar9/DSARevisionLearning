package DSARevisionLearning.strings;
public class Q_10_String_Operations_concatenate_replace {
    public static void main(String args[]){
         /*Given a string A, concatenate it with itself to form a new string. From this new string,
  remove all uppercase letters and replace every vowel ('a', 'e', 'i', 'o', 'u') with '#'. */
        String s1="AbcaZeoB"; System.out.println("Original String \n"+s1);
        stringOperationsConcatReplaceHelper(s1);
         //Expected output AbcaZeoB+AbcaZeoB = AbcaZeoBAbcaZeoB
         //  final String         //  bc###bc###  
    }
    public static void stringOperationsConcatReplaceHelper(String str){
        if(str==null || str.isEmpty()){System.out.println("String is empty or null"); return;}

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A' && c<='Z'){
                continue;
            }
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                sb.append('#');
            }else{
                sb.append(c);
            }
        }
            System.out.println("\n New Modified String \n"+sb);
            String newString=sb.toString();
            String finalString=newString+newString;
             System.out.println("\nNew Modified String Final Concatenated \n"+finalString);
        }
    }

