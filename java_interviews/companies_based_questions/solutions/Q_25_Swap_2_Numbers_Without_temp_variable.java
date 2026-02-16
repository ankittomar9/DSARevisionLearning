package java_interviews.companies_based_questions.solutions;

public class Q_25_Swap_2_Numbers_Without_temp_variable {
    public static void main(String args[]){
        int a=10; int b=20;

        System.out.println("Before Swap : a = " +a + ", B = "+b );
        swapArithmetic(a, b);

        swapXOR(a, b);
    }
        public static void swapArithmetic(int a,int b){
            a=a+b;
            b=a-b;
            a=a-b;
              System.out.println("After Arithmetic Swap : \n  a = " +a + ", B = "+b );
        }

         public static void swapXOR(int a,int b){
            a=a^b;
            b=a^b;

            a=a^b;

              System.out.println("After XOR Swap :  \n  a = " +a + ", B = "+b );
        }
    
}
