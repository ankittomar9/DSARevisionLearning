package dsa_jan_revision.arrayBasics;

public class Q_68_Divisibility_By_8 {
    public static void main(String[] args) {
        System.out.println("Evaluating:\n \"16\"");
        System.out.println("Result: " + solve("16") + "\n");
        System.out.println("Evaluating:\n \"123\"");
        System.out.println("Result: " + solve("123") + "\n");
        
System.out.println("Evaluating Massive Number:\n \"888888888888888888888120\"");
        System.out.println("Result: " + solve("888888888888888888888120"));
    }
    public static int solve(String s){
        if(s==null || s.length()==0){return 0;}
        int n=s.length();
        if(n<=2){
            int num=Integer.parseInt(s);
            return (num%8==0) ? 1:0;
        }
        String tail =s.substring(n-3);
        int tailNum=Integer.parseInt(tail);

        if(tailNum %8==0){return 1;}
        else{return 0;}
    }
}
