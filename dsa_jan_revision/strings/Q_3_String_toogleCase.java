package dsa_jan_revision.strings;

public class Q_3_String_toogleCase {
    public static void main(String args[]){
        String str="THIS is A %^&WORKING example1231 of tOGGLE_CASE";
        System.out.println("Original String : \n"+str);
        toggleCaseHelper(str);
    }
    public static void toggleCaseHelper(String str){
        if(str==null || str.isEmpty()){
            System.out.println("String is Empty or NULL");
            return;
        }

        char arr[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }else
                 if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)(arr[i]+32);
            }
        }
        String str1=new String(arr);
        System.out.println("Converted String : \n"+str1);
    }
}
