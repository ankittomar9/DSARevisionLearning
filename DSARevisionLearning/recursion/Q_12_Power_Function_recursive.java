package DSARevisionLearning.recursion;

public class Q_12_Power_Function_recursive {
    public static void main(String args[]){
        int a=2; int n=5;
        
        long result=powerHelper(a,n);
        System.out.println("Power of a^n is : \n"+result);

    }

    public static long powerHelper(int a,int n){
        if(n==0){
            return 1;
        }

        long result=powerHelper(a, n-1)*a;
        return result;
    }
}
