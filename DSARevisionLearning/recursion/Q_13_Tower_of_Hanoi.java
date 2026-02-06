package DSARevisionLearning.recursion;

public class Q_13_Tower_of_Hanoi {
    public static void main(String args[]){
        int n=3;

        towerOfHanoiHelper(n,"A","B","C");
    }
    public static void towerOfHanoiHelper
    (int n,String src,String helper,String dest){
        if(n==1){
              System.out.println("Move Disk 1 from "+src + " to "+ dest);
            return;
        }

        towerOfHanoiHelper(n-1,src,dest,helper);
        System.out.println("Move Disk "+ n + " from "+src+ " to "+ dest);
        towerOfHanoiHelper(n-1,helper,src,dest);


    }
}
