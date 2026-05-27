package java_interviews_revision.companies_based_question_solutions_rev1;

import java.util.ArrayList;
import java.util.List;

public class Q_2_Check_primes_between_1_to_N_brute {
    public static void main(String[] args) {
        int n=20;
        primeCheckHelper(n);
    }
    public static void primeCheckHelper(int n){
      
        List<Integer> list =new ArrayList<>();
        for(int i=2;i<=n;i++){
             int countFactors=1;
            for(int j=2;j<=n;j++){
                if(i%j==0){
                    countFactors++;
                }
               
               }
               if(countFactors==2){
                    list.add(i);
                }
        }
        System.out.print(list);
    }
}
