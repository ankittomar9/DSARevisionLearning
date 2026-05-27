package java_interviews_revision.companies_based_question_solutions_rev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_2_Check_primes_between_1_to_N_Sieve {
    public static void main(String[] args) {
        int n=50;
        System.out.println("Prime Sieve ");printPrimeSieve(n);
    }
    public static void printPrimeSieve(int n){
        if(n<2){  System.out.println("No primes up to "+n);return;       }
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0]=false;
        isPrime[1]=false;

        for(int p=2;p*p<=n;p++){
            if(isPrime[p]==true){

                for(int i=p*p;i<=n;i=i+p){
                    isPrime[i]=false;
                }
            }
        }
        List<Integer>primeNumbers=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i]==true){
                primeNumbers.add(i);
            }
        }
        System.out.println("Primes up to "+n +" : \n"+ primeNumbers);
    }
}
