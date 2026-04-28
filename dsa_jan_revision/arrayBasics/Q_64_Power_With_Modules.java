package dsa_jan_revision.arrayBasics;

public class Q_64_Power_With_Modules {
    public static void main(String[] args) {
       System.out.println("Result 1 : " + solve(2,3,3));

         System.out.println("Result 2 : "+solve(5,2,4));
          System.out.println("Result 3 : "+solve(71045970, 41535484, 64735492));
              System.out.println("Result 4 : "+solve(6,3,5));
            //  System.out.println("Result 1 : " + solve(2,3,3));

        
    }
    public static int solve(int A,int B,int C){
        if(B==0){  return 1%C;} if(A==0){ return 0;}
        long ans=1;
        long base=A%C;
        while(B>0){
            if(B%2==1){
                ans=(ans*base)%C;
            }
            base=(base*base) %C;
            B=B/2;
        }
        return (int) ans;
    }
}
