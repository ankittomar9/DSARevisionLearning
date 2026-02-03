package DSARevisionLearning.strings;
public class Q_5_Reverse_a_String_using_twoPointers {
    public static void main(String args[]){
        String s1="blue_is_the_sky";
         System.out.println("Original String : "+s1);
        /*Do not use this 
        StringBuilder str=new StringBuilder(s1);
        str= str.reverse();  
        System.out.println(str); */
        char arr[]=s1.toCharArray();

        String result= reverseHelper(arr);
         System.out.println("New reversed String : "+ result);
    }
    public static String reverseHelper(char arr[] ){
        int i=0;int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        String reversed=new String(arr);
        return reversed;
           }    
}
