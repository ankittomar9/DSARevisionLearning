package DSARevisionLearning.hashmap;

import java.util.HashMap;

public class Q_1_Hashmap_Generation_Printing {
    public static void main(String args[]){
        // 10 30 50  15 25 store is hashmap

        HashMap<String,Integer> map=new HashMap<>();

        map.put("Aman",95);map.put("Naman",85);map.put("Chaman",75);map.put("Daman",90);

        System.out.println(map.get("Aman"));
        System.out.println(map.get("Chaman"));

        System.out.println(map);
    }
    
}
