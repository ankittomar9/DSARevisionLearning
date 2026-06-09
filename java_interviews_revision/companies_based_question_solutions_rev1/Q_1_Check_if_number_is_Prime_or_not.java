package java_interviews_revision.companies_based_question_solutions_rev1;

public class Q_1_Check_if_number_is_Prime_or_not {
    public static void main(String[] args) {
        int n=19;        System.out.println("Original number : "+n);
        boolean  result=isNumberPrime(n);
        if(result==true){
             System.out.println("Given number is Prime "+result);
        }else{
             System.out.println("Given number is Not  Prime "+result);
        }

         int n2=10;        System.out.println("Original number : "+n2);
        boolean  result2=isNumberPrime(n2);
        if(result2==true){
             System.out.println("Given number is Prime "+result2);
        }else{
             System.out.println("Given number is Not  Prime "+result2);
        }
    }
    public static boolean isNumberPrime(int n){
        int countFactors=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                countFactors++;
            }
        }
        if(countFactors==2){
            return true;
        }else{
            return false;
        }
    }
}
