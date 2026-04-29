package dsa_jan_revision.arrayBasics;

public class Q_69_Concatenate_Three_Numbers {
    public static void main(String[] args) {
        int A1=10;int B1=20;int C1=30;
        System.out.println(" Result of Input "+A1+" , "+B1+" , "+C1+" ");
        System.out.println("Result : "+solve(A1,B1,C1));
    
        
        int A2=55;int B2=43;int C2=47;
        System.out.println(" Result of Input "+A1+" , "+B1+" , "+C1+" ");
        System.out.println("Result : "+solve(A2,B2,C2));
    
    }
    public static int solve(int A,int B,int C){
            int min=Math.min(A,Math.min(B, C));
             int max=Math.max(A,Math.max(B, C));

             int mid=(A+B+C) -min-max;
             int result= (min*10000)+(mid*100)+max;
             return result;
    }
}
