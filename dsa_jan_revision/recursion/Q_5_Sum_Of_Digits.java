package dsa_jan_revision.recursion;

public class Q_5_Sum_Of_Digits {
    public static void main(String[] args) {
        long n1= 12345;
        System.out.println("Original Number : "+n1);
        long result1=sumOfDigitsHelper(n1);
        System.out.println("Sum of Digits is : \n"+result1);
            long n2= -987;
        System.out.println("Original Number : "+n2);
        long result2=sumOfDigitsHelper(n2);
        System.out.println("Sum of Digits is : \n"+result2);
    }
    public static long sumOfDigitsHelper(long n){
        if(n<0){
            n=Math.abs(n);
        }
       return sumOfDigits(n);
    }
    public static long sumOfDigits(long n){
        if(n==0){
            return 0;
        }
        long extract=n%10;
        long reduce=n/10;
        return extract+ sumOfDigits(reduce);
    }

}
