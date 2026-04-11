package DSARevisionLearning.strings;
public class Q_10_String_Operations_concatenate_replace {
    public static void main(String args[]){
        String s1="AbcaZeoB"; System.out.println("Original String \n"+s1);
        stringOperationsConcatReplaceHelper(s1);
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

