package DSARevisionLearning.hashmap;
import java.util.HashMap;
public class Q_6_Find_First_Non_Repeating_Element {
    public static void main(String args[]){
        int arr[]={9,6,9,7,6,4,7};
        if(arr.length==0){
              System.out.println("Empty array " );return;
        }
        boolean isFound=false;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
         System.out.println("Frequency Map: " + map);

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                 System.out.println("First non-repeating element is: " + arr[i]);
                isFound=true;
                break;
            }
        }
        if(!isFound){
             System.out.println("No first non repeating elements"); 
        }
    }
}
