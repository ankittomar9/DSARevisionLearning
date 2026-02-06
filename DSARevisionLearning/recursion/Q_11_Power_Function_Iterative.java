package DSARevisionLearning.recursion;

public class Q_11_Power_Function_Iterative {
    public static void main(String args[]){
         int a=10;  int n=2;
        //Expected a^n which is 10^2 ==100
        long ans=1;
        for(int i=0;i<n;i++){
            ans=ans*a;
        }

        System.out.println("Power of a^n is \n"+ans);
    
    }
    
}
