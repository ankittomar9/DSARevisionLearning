package DSARevisionLearning.recursion;

public class Q_1_Print_N_to_1_Numbers {

    /*Print from from N to 1 */
    public static void main(String args[]){
        int n=10;
        n_to_1_print_Helper(n);
    
    }
    public static void n_to_1_print_Helper(int n){
        if(n<=0){ // base case
            return ;
        }
        System.out.print(n+" ");
        n_to_1_print_Helper(n-1);

    }
}
