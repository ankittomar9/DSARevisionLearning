package DSARevisionLearning.recursion;

public class Q_2_Print_1_to_N_Numbers {
      /*Print from from 1 to N */
    public static void main(String args[]){
        int n=10;
         System.out.println("The numbers from 1 to N are : ");
        printHelper_1_to_N_helper(n);
    }
    public static void printHelper_1_to_N_helper(int n){
        if(n<=0){ //edge case
            return;
        }    
        
        printHelper_1_to_N_helper(n-1);
        System.out.print(n+" ");

    }   
}

/*
TC:O(n)
SC:O(n) because of call stack recursion takes 
*/