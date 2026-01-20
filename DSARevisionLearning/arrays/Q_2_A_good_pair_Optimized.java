package DSARevisionLearning.arrays;
import java.util.HashMap;
import java.util.Map;
public class Q_2_A_good_pair_Optimized {
    public static void main(String args[]){
        int arr[]={1,2,3,4,4,5,6};int target=7;
        //we Optimized this problem using a HashMap
        //Since arr[i]+arr[j]==target
        // arr[j]=target-arr[i]==required

        Map<Integer,Integer> hm=new HashMap<>();
            int count=0;  

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int required=target-current;

            if(hm.containsKey(required)){
              System.out.println("Pair Found : [ "+ required +" , "+current+" ]" );
            }
            hm.put(current,i);
        }        
    }
    
}
