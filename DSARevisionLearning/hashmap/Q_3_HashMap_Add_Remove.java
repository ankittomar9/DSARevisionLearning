package DSARevisionLearning.hashmap;

import java.util.HashMap;

public class Q_3_HashMap_Add_Remove {
    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 10);
         map.put(2, 20);
          map.put(3, 30); //removed
           map.put(4, 40);
            map.put(5, 50);

                map.put(null,99);
                 map.put(null,100);
                  System.out.println("Original Map : \n"+map);

                   map.remove(3);
                   map.remove(null);

                   // hm.remove(50); -> Fails, because 50 is not a Key.
        // hm.removeValue(50); -> Doesn't exist in Java API.
        System.out.println("Removed a key value pair \n"+map);

        // using values collection
        map.values().remove(50); 
        System.out.println("After removing Value 50 (The Backdoor method): \n" + map);
    }
}
