package DSARevisionLearning.strings;
public class Q_1_Strings_to_lower_case {
    public static void main(String args[]){
      /*Goal  is to convert the UpperCase string to lowerCase */
        String s1="AMAN_KNOWS_JAVA_VERY_WELL";
          System.out.println("Original String\n"+s1);
        //String are immutable so we need to convert it to char array or
        //Use String Builder (here we won't use string builder)
        if(s1==null || s1.length()==0  ){
            System.out.println("String is Empty  or null");return;
        }

        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
              arr[i]=(char)(arr[i]+32);
            }
        }
        String s2=new String(arr);

        System.out.print("\nConverted to lowerCase\n"+s2);
    }
    
}

/*TC: O(N)
  SC:O(N) because of char array even if we used string builder it would have been same
*/
