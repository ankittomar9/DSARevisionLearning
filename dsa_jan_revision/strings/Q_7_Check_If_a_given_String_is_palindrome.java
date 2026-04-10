package dsa_jan_revision.strings;
public class Q_7_Check_If_a_given_String_is_palindrome {
    public static void main(String args[]){
        String str1="racecar";
           System.out.println("Original String : \n"+str1);
            isPalindrome(str1);
        String str2="aman";
           System.out.println("Original String : \n"+str2);
            isPalindrome(str2);
    }
    public static void isPalindrome(String str){
        if(str==null || str.isEmpty()){System.out.println("Empty or Null String");return;}
        String originalString=str;
        char arr[]=str.toCharArray();
        int i=0;int j=str.length()-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        String reversedString=new String(arr);
        if(originalString.equals(reversedString)){   // if you compare string == with this it will always give false
              System.out.println("Given String is Palindromic");
               System.out.println(originalString+ " == "+reversedString);
        }else{
              System.out.println("Given String is not Palindromic");
                 System.out.println(originalString+ " != "+reversedString);
        }
    }
}
