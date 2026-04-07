package dsa_jan_revision.strings;
public class Q_1_String_to_lower_case {
    public static void main(String args[]){
        String str="LEARNING JAVA PROGRAMMING";
         System.out.println("Original String : \n"+str);
         toLowerCaseHelper(str);
    }
    public static void toLowerCaseHelper(String str){
        if(str==null || str.isEmpty()){
            System.out.println("String is Empty  or null");return;}
    
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
           // char ch=str.charAt(i);

            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)(arr[i]+32);
            }
        }
        String s2=new String(arr);
        System.out.println("Converted String : \n"+s2);
    }
}
