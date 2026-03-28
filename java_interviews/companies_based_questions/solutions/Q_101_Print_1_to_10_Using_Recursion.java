package java_interviews.companies_based_questions.solutions;

public class Q_101_Print_1_to_10_Using_Recursion {
    public static void main(String args[]){
        int n1=10;
          System.out.println("Number Printing of 1 to "+n1+ " is : ");
        numberPrinterhelper(n1);

         int n2=5;
        System.out.println("\nNumber Printing of 1 to "+n2+ " is : ");
        numberPrinterhelper(n2);

                 int n3=20;
        System.out.println("\nNumber Printing of 1 to "+n3+ " is : ");
        numberPrinterhelper(n3);
        

    }
    public static void numberPrinterhelper(int n){
        if(n==0){return ;}
        numberPrinterhelper(n-1);
         System.out.print(n+" ");

         //change the position of sysout if you want to print in reverse
    }
}
