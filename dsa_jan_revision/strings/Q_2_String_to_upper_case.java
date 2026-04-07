package dsa_jan_revision.strings;

public class Q_2_String_to_upper_case {
    public static void main(String args[]){
        String str="java stream* functional$ interfaces10";
        System.out.println("Original String: \n" + str);
        toUpperCaseHelper(str);
        
    }
    public static void toUpperCaseHelper(String str){
        if(str==null || str.isEmpty())
            {System.out.println("String is empty or null");return;}
    
        char arr[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }
        String str1=new String(arr);
        System.out.println("String after conversion \n"+str1);
    }
}
