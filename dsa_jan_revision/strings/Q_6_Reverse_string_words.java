package dsa_jan_revision.strings;
import java.util.Arrays;
public class Q_6_Reverse_string_words {
    public static void main(String args[]){
        String s1="the sky is blue";
         System.out.println("Original String : \n" + new String(s1));
        char arr[]=s1.toCharArray();
        int start=0; int end=arr.length-1;
 reverseStringHelper(arr,start,end);System.out.println(Arrays.toString(arr)); 

         for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                reverseStringHelper(arr, start, i-1);
                start=i+1;
            }else if(i==end){
                reverseStringHelper(arr, start, end);
            }
         }
         
         String str2=new String(arr);
          System.out.println("Reversed Words String: \n" + str2);
    }
    public static void  reverseStringHelper(char arr[],int start,int end){
        if(arr==null || arr.length==0){
            System.out.println("Empty or Null string");return;   }
        int i=start;int j=end;
         while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;   j--;
        }
    }
}
