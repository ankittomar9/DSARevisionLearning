package DSARevisionLearning.strings;

public class Q_3_1_Toggle_case_Lower_Upper_case_CountChars {
    public static void main(String args[]){
         String s1="ankit_doing_JAVA_DSA_lEARNING";
          System.out.println("Original String \n"+s1);
          if(s1==null || s1.length()==0){
            System.out.println("Empty String or Null String");return;
        }
         char arr[]=s1.toCharArray();
        int upperCount=0;
        int lowerCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
               upperCount++;
            }else if(arr[i]>='A' && arr[i]<='Z') {
                arr[i]=(char)(arr[i]+32);    
               
                  lowerCount++;
            }
        }
           String s2=new String(arr);
            System.out.println("\nModified String \n"+s2);
         System.out.println("\nUpper Case Count \n"+upperCount);
         System.out.println("\n Lower Case Count \n"+ lowerCount);
    }
}

/*TC: O(N)
  SC:O(N) because of char array even if we used string builder it would have been same
*/

