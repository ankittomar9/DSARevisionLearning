package java_interviews.companies_based_questions.solutions;

public class Q_102_Sum_of_Natural_Numbers_Using_Recursion {
    public static void main(String args[]){
        int n1=5;
        long result1=naturalNumberSumHelper(n1);
        System.out.println("Sum of "+n1+" is : "+result1);

         int n2=9;
        long result2=naturalNumberSumHelper(n2);
        System.out.println("Sum of "+n2+" is : "+result2);

         int n3=-10;
        long result3=naturalNumberSumHelper(n3);
        System.out.println("Sum of "+n3+" is : "+result3);
    }
    public static long naturalNumberSumHelper(int n){
        if(n<0){
            throw new IllegalArgumentException("Negative  numbers are not natural Sum not Defined.");
        }
        if(n==0){return 0 ;}

        long sum=0;
        sum=naturalNumberSumHelper(n-1)+n;
        return  sum;
       }
}
