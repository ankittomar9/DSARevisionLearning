package DSARevisionLearning.strings;
import java.util.Arrays;
public class Q_6_Reverse_string_words {
    public static void main(String args[]){
           String s1="the sky is blue";
           System.out.println("Original String : \n"+s1);
        char arr[]=s1.toCharArray();
        int start=0; int end=arr.length-1;

        reverseStringHelper(arr,start,end);
         System.out.println(Arrays.toString(arr)); 

         for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                  reverseStringHelper(arr,start,i-1);
                  start=i+1;
            }
            else if( i== end){
                 reverseStringHelper(arr,start,end);
            }
         }
         System.out.println("Final Result: " + new String(arr));
      
        }
        public static void reverseStringHelper(char arr[],int start,int end){
            int i=start;int j=end;
           while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;            j--;
           }            
        }
}
