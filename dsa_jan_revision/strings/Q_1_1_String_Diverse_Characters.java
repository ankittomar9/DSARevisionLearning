package dsa_jan_revision.strings;
public class Q_1_1_String_Diverse_Characters {
    public static void main(String args[]){
        String str1="HelloUser1";
         System.out.println("Original String : \n"+str1);
        diverseStringHelper(str1);
        String str2="M12345MYNAME12isnot";
             System.out.println("Original String : \n"+str2);
        diverseStringHelper(str2);

    }
    public static void diverseStringHelper(String str){
            if(str==null || str.isEmpty()){System.out.println("Empty or Null String");return;}

            int n = str.length();
        int charCount=0;
        int numCount=0;
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if(ch>='0' && '9'>= ch) {
                numCount++;
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                charCount++;
            }
        }
          System.out.println("Characters Count : \n"+charCount);
             System.out.println("Numeric Count : \n"+numCount);
    }
}
