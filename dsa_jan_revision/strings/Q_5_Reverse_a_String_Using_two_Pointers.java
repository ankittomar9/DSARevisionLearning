package dsa_jan_revision.strings;
public class Q_5_Reverse_a_String_Using_two_Pointers {
    public static void main(String args[]){
        String str="Java Stream321 654programming";
          System.out.println("Original String  : \n"+str);
        reverseStringHelper(str);
    }   
    public static void reverseStringHelper(String str){
        if(str==null || str.isEmpty()){
            System.out.println("Empty or Null String");
        }
        char arr[]=str.toCharArray();
        int i=0;int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;   j--;
        }
        String str1=new String(arr);
        System.out.println("Reversed String  : \n"+str1);
    } 
}

