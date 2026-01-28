package DSARevisionLearning.hashmap;
import java.util.HashMap;
public class Q_11_Count_Distinct_elements_using_Hashmap_Only {
    public static void main(String args[]){
        int arr[]={2,4,8,4,6,3,6,2,3,1,5,7,1,8,2,4,6,7};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
        // List<Integer> result=new ArrayList<>();

        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])) {
        //         result.add(arr[i]);
        //         map.remove(arr[i]);
        //     }
        // }
        // System.out.println(result);

        System.out.println("Distinct elements: " + map.keySet()); 
                    System.out.println("Count: " + map.size());
    }
}
