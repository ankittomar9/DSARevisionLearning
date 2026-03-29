package java_interviews.companies_based_questions.solutions;

public class Q_109_Reverse_a_number_using_recursion {
    public static void main(String args[]){
        int n1=1234;        int n2=9876;        int n3=1123;

        long result1=reverseHelper(n1,0);
        System.out.println("reverse number of "+n1+" is : "
        +result1);

         long result2=reverseHelper(n2,0);
        System.out.println("reverse number of "+n2+" is : "
        +result2);

         long result3=reverseHelper(n3,0);
        System.out.println("reverse number of "+n3+" is : "
        +result3);
    }
    public static long reverseHelper(long n,long currentReverse){
        if(n==0){return currentReverse;}
        long extract=n%10;
        long newReverse=(currentReverse*10) + extract;
        long reduce=n/10;
        
        return reverseHelper(reduce,newReverse);
    }
}
