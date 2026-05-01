package dsa_jan_revision.bitmanipulation;

public class Q_1_Any_base_to_decimal {
    public static void main(String[] args) {
        int n1=1010; int b1=2;
         System.out.println("Input n is : "+n1 + " and b is : "+b1); 
            anyBaseToDecimalHelper(n1, b1);
              int n2=22 ;int b2=3;
            System.out.println("Input n is : "+n1 + " and b is : "+b2); 
            anyBaseToDecimalHelper(n2, b2);
              int n3=045 ;int b3=8;
             System.out.println("Input n is : 045" + " and b is : "+b3); 
            anyBaseToDecimalHelper(n3, b3);
          
    }
    public static void anyBaseToDecimalHelper(int n,int b){
          if (n == 0) {    System.out.println("Empty Number is given");  return;}
        int answer=0; int power=1;
        while(n>0){
            int remainder=n%10;
            if(remainder>=b){ 
                System.out.print("Invalid Number");  return;
            }
            answer=answer+remainder*power;
            n=n/10;
            power=power*b;
        }
        System.out.println("Decimal value : "+answer);
    }   
}
