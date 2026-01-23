package DSARevisionLearning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q_2_HashMaps_Iterations {
    public static void main(String args[]){
        
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Aman",95);map.put("Naman",85);
        map.put("Chaman",75);map.put("Daman",90);

        
        for(String key:map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
    
}
