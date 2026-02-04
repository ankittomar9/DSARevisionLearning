package DSARevisionLearning.recursion;
public class Q_6_Reverse_Number_Using_Recursion_v1 {
    public static void main(String args[]){
        /*Reverse a Number using Recursion this fails if
         we int reversed = reverse(1234) + 1*/
        long n=12345;
          System.out.println("Original number : "+n);
        //expected output  54321
           System.out.println("Reversed Number : ");
        reverseHelper(n);  
    }
    public static void  reverseHelper(long n){
        if(n==0){   return;
        }
        long extract=n%10;

        System.out.print(extract+"");  

        long reduce=n/10;
        reverseHelper(reduce);
    }    
}
