package DSARevisionLearning.hashmap;
import java.util.HashMap;
public class Q_13_Two_Sum__Equals_to_target {
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;

        HashMap<Integer,Integer> map=new HashMap<>();
        int complement=0; boolean isFound=false;
       
        for(int i=0;i<arr.length;i++){
            int current=arr[i]; // for index tracking and pair use
            complement=target-current;

            if(map.containsKey(complement)){
                System.out.println("Pair found: " + current + " and " + complement);
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                isFound = true;
                break; // Found it!
            }

            map.put(current, i);
        }

        if (!isFound) {
            System.out.println("No pair found");
        }

    }
    
}
