package java_interviews.companies_based_questions.solutions;
public class Q_78_Sum_Of_Numbers_In_String  {
    public static void main(String args[]){
        String s1="1xyz23";
        String s2="abc12345def67";
        String s3="100";
         System.out.println("Sum of '" + s1 + "': " + calculateSum(s1));
        System.out.println("Sum of '" + s2 + "': " + calculateSum(s2));
        System.out.println("Sum of '" + s3 + "': " + calculateSum(s3));

    }
    public static int calculateSum(String str){
        if(str ==null || str.isEmpty()){            return 0;        }
        int sum=0;
        int temp=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             
            if(ch>='0' && ch<='9'){
                int digit = ch-'0';
                temp=(temp * 10)+digit;
            }else{
                sum=sum+temp;
                temp=0;
            }
        }
             sum=sum+temp;
         return sum;
    }
}
