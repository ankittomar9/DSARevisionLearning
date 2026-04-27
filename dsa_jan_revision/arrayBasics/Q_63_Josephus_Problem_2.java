package dsa_jan_revision.arrayBasics;

public class Q_63_Josephus_Problem_2 {
    public static void main(String[] args) {
        int testCase[]={4,5,100};
        for(int i=0;i<testCase.length;i++){
            System.out.println("Evaluating A = " + testCase[i] + ":");
            System.out.println("Survivor is Person: " + solve(testCase[i]) + "\n");
        }
        
    }
    public static int solve(int A){
        if(A<=0)return 0; 
        if(A==1) return 1;

        int p=1;
        while(p*2<=A){
            p=p*2;
        }
        int L=A-p;
        int result= (2*L)+1;
        return result;
    }
}
