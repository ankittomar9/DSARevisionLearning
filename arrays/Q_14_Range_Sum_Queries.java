package DSARevisionLearning.arrays;
import java.util.Arrays;
public class Q_14_Range_Sum_Queries {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};

        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
       System.out.println("Prefix array \n"+Arrays.toString(prefix_arr));        
            int sum=0;
            int queries[][]={{1,3},
                             {0,4},
                             {2,2},
                             {0,0}};
        for(int j=0;j<queries.length;j++){
            int s=queries[j][0];
            int e=queries[j][1];
            
            if(s==0){
                sum=prefix_arr[e];
            }else{
                sum=prefix_arr[e]-prefix_arr[s-1];
            }
        System.out.println("Sum of range ("+s+" , "+e+") = "+sum);
        }
       
    }
    
}
