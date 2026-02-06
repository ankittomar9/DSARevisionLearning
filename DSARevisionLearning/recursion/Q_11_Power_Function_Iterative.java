package DSARevisionLearning.recursion;

public class Q_11_Power_Function_Iterative {
    public static void main(String args[]){
        long a=2 ;long n=5;  //expected output is a^b = 2^5=32

        long result=powerHelper(a,n);
        System.out.println("Power of a is  "+result);
    }
    public static long powerHelper(long a,long n){
        long power=1;
        long ans=0;

        for(int i=0;i<n;i++){
            ans=ans*power;
            power=power*n;
        }
        return ans;
    }
    
}
