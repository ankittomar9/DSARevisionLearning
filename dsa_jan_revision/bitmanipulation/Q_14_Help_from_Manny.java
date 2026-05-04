package dsa_jan_revision.bitmanipulation;

public class Q_14_Help_from_Manny {
    public static void main(String[] args) {
        /*Alex and Manny are good friends.
 Alex is doing a lot of programming these days. He has set a target score of A for himself.
  Initially, Alex’s score was zero. Alex can double his score by doing a question,
 or Alex can seek help from Manny for doing questions that will contribute 1 to Alex’s score. 
 Alex wants his score to be precisely A. Also, he does not want to take much help from Manny.
 Find and return the minimum number of times Alex needs to take help from Manny to achieve a score of A. */
        int A=5;
        System.out.println("Original Number is \n"+A);
        solve(A);
    }
    public static void solve(int A){
        int helpCount=0;

        while(A>0){
            if(( A & 1)==1){
                helpCount++;
            }
            A=A>>1;
        }
        System.out.println("Minimum Cost is \n"+helpCount);
    }

}
