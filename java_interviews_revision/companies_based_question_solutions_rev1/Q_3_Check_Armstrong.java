package java_interviews_revision.companies_based_question_solutions_rev1;

public class Q_3_Check_Armstrong {
    public static void main(String[] args) {
        int n=153;
        System.out.println("Originsl Number : " +n);
        boolean result=armsStrongNumberChecker(n);
        if(result==true){
            System.out.println(" Given Number is ArmsStrong number "+result);
        }else{
             System.out.println(" Given Number is not ArmsStrong number "+result);
        }
    }
    public static boolean armsStrongNumberChecker(int n){
        if(n==0){return false;}
        int originalNumber=n;
        int sum=0;
        while(n>0){
            int extract=n%10;
            sum=sum+(extract*extract*extract);
            n=n/10;
        }

        return sum==originalNumber;
    }
}
