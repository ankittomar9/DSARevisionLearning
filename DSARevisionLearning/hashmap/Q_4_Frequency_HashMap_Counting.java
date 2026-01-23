package DSARevisionLearning.hashmap;

import java.util.HashMap;

public class Q_4_Frequency_HashMap_Counting {
    public static void main(String args[]){
        int arr[]={10,20,20,10,10,5,10,20};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int variable:arr){
            if(map.containsKey(variable)){
                map.put(variable,map.get(variable)+1);
            }
            else{
                map.put(variable, 1);
            }
        }

        System.out.println(map);
    }
    
}
