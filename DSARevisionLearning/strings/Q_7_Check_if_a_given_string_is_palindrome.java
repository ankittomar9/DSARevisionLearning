package DSARevisionLearning.strings;
public class Q_7_Check_if_a_given_string_is_palindrome {
        //A string is Palindromic if reverse is equal to original
    public static void main(String args[]){
        String s1="naman";
          System.out.println("Original  String : \n"+s1);
        if(s1==null || s1.length()==0){
            System.out.println("String is null || or empty ");  return; }

        char arr[]=s1.toCharArray();
        String reverse =palindromeCheck(arr);
         System.out.println("Reversed String : \n"+reverse);
     
         if(s1.equals(reverse)){
            System.out.println("Given String is Palindromic");
        }else{
             System.out.println("Given String is not Palindromic");
        }
    }
    public static String palindromeCheck(char arr[]){
        int i=0;int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;      j--;
        }
        String s2=new String(arr);
        return s2;
    }
    
}
