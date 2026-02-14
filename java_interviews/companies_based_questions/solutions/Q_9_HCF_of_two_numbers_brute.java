package java_interviews.companies_based_questions.solutions;

public class Q_9_HCF_of_two_numbers_brute {
    public static void main(String args[]){
        //HCF is aslo called GCD  
        //if n1 n2 > 0
        int n1=20;
        int n2=30;

        int hcf=findGCDBrute(n1,n2);
         System.out.println("GCD of " + n1 + " and " + n2 + " is: " + hcf);
    }
    public static int findGCDBrute(int n1,int n2){
       int min=Math.min(n1, n2);

       for(int i = min; i >= 1; i--){

        if(n1%i==0 && n2%i==0){
            return i;
        }
       }
       return 1;
       
    }
    
}
