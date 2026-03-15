package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_13_Arrays_Q_Queries_Sum_optimized {
    public static void main(String args[]){
        int arr[]={10,20,10,5,15};
        int queries[][]={
            {1,3},
            {0,4},
            {2,2},
        };

        int prefixArr[]=new int [arr.length];
        
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        System.out.println("Prefix Array : "+Arrays.toString(prefixArr));
          int sum=0;
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];

            if(s==0){
                sum=prefixArr[e];
            }else{
                sum=prefixArr[e]-prefixArr[s-1];
            }
                System.out.println("Range ["+s + " ," + e+ "] Sum = "+sum);
        }   

    
    }
}
