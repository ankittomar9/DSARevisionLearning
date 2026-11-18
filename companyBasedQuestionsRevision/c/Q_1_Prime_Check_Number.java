package companyBasedQuestionsRevision.c;

public class Q_1_Prime_Check_Number {
    public static void main(String[] args) {
            int n1=19;primeCheckHelper(n1);
            int n2=8; primeCheckHelper(n2);
            int n3=13;primeCheckHelper(n3);
            int n4=0;primeCheckHelper(n4);
    }
    public static void  primeCheckHelper(int n){
        if(n==0 || n==1){
            System.out.println("0 and 1 are not  prime "); return;
        }
        int originalNumber=n;
        int factorsCount=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                factorsCount++;
            }
        }
        if(factorsCount==2){
            System.out.println("Given number is  Prime : "+n);
        }else{
              System.out.println("Given number is  not Prime : "+n);
        }


    }
}
