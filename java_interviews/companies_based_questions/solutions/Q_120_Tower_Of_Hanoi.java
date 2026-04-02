package java_interviews.companies_based_questions.solutions;

public class Q_120_Tower_Of_Hanoi {
    public static void main(String args[]){
        int n=3;
        
        solveHanoi(n,"A","B","C");
    }

    public static void solveHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Move Disk 1 from "+src+ " to "+dest);
            return;
        }
        solveHanoi(n-1,src,dest,helper);
          System.out.println("Move Disk "+n+" from "+src+ " to "+dest);
        solveHanoi(n-1,helper,src,dest);
    }
}
