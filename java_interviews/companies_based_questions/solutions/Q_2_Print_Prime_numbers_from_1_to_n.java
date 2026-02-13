package java_interviews.companies_based_questions.solutions;
import java.util.ArrayList;
import java.util.List;
public class Q_2_Print_Prime_numbers_from_1_to_n {
    public static void main(String args[]){
        int n=19;
        primePrinterHelper(n);

    }
    public static void primePrinterHelper(int n){
          if(n<=0){ System.out.println("Invalid Input or Negative number(Invalid input)"); 
            return ;}
        List<Integer> list=new ArrayList<>();
        
        for(int i=2;i<=n;i++){
            int factorsCount=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    factorsCount++;
                   
                }
            }
          //  System.out.println(factorsCount);
            if(factorsCount==2){
                 list.add(i);
            }
           
        }

        System.out.println("Primes numbers between 1 to n are  \n"+list);
    }
    
}
