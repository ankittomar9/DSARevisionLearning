package DSARevisionLearning.recursion;
public class Q_5_Sum_Of_Digits {
    public static void main(String args[]){
        long n=1234;
        //Expected output is 1+2+3+4=10
        long result=digit_Sum_Helper(n);
        System.out.println("Sum of digits is \n"+result);

    }
    public static long digit_Sum_Helper(long n){
         //base case
          if(n<=0){return 0;}
        
          //main logic
          long extract=n%10;

          long reduce=n/10;
            //recursive call
          return extract+digit_Sum_Helper(reduce);
    }   
}
/*TC: O(log N) or O(digits)
  SC:O(log N) (Stack)
*/
