package dsa_jan_revision.arrayBasics;
public class Q_67_Leap_Year {
    public static void main(String[] args) {
        int testYears[]={2020,1999,1900,2000,2024,2032};
        for(int year : testYears){
              System.out.print("Evaluating Year: " + year + " -> ");
              int result=solve(year);

              if(result==1){
                System.out.println("\n Result : 1 (Leap Year)");
              }else{
                System.out.println("\n Result : 0 (Not a Leap Year)");
              }
        }
    }
    public static int solve(int A){

        if(A %400 ==0  || (A%4==0 && A % 100!=0))
            { 
                return 1;
            }
        return 0;
    }
}
