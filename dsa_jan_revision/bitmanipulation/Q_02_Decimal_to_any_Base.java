package dsa_jan_revision.bitmanipulation;

public class Q_02_Decimal_to_any_Base {
    public static void main(String[] args) {
         int n=13; int b=2; 
          decimalToAnyBaseHelper(n,b);
    }
    public static void decimalToAnyBaseHelper(int n,int b){
          if (n == 0) {    System.out.println("Empty Number is given");  return;}
          
      
            
         int  answer=0;int power=1;

         while(n>0){
            int remainder=n%b;
            answer=answer+remainder*power;
            n=n/b;
            power=power*10;
         }

         System.out.println("Converted number from decimal to anyBase  : \n"+answer);

    }
}
