package DSARevisionLearning.strings;

import java.util.Arrays;

public class Q_1_Strings_to_lower_case {
    public static void main(String args[]){
        String s1="ankit_learns_programming";
          System.out.println("Original string \n"+s1);
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }
        String s2=new String(arr);
        System.out.println("Converted string \n"+s2);

        System.out.println(Arrays.toString(arr));
    }
    
}
