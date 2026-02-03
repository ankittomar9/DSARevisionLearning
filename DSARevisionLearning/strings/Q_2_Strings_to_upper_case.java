package DSARevisionLearning.strings;
public class Q_2_Strings_to_upper_case {
    public static void main(String args[]){ 
         /*Goal  is to convert the UpperCase string to lowerCase */
         //String are immutable so we need to convert it to char array or
        //Use String Builder (here we won't use string builder)
        String s1="aman_learns_java_streams";
        System.out.println("Original String \n"+s1);
        if(s1==null || s1.length()==0){
            System.out.println("Empty String or Null String");return;
        }
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }
        String s2=new String(arr);

        System.out.println("\nConverted to upperCase \n"+s2);

    }  
}


/*TC: O(N)
  SC:O(N) because of char array even if we used string builder it would have been same
*/
