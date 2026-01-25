package DSARevisionLearning.hashmap;
import java.util.HashMap;
public class Q_10_First_Repeating_Element {
    public static void main(String args[]){
        /* Problem: Given arr[] = {10, 5, 3, 4, 3, 5, 6}.
        Goal: Return the one that occurs earliest in the array. */
        int arr[]={10, 5, 3, 4, 3, 5, 6};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
     }
            boolean isFound=false;
                for(int i=0;i<arr.length;i++){
                    if(map.get(arr[i])>1){
                        System.out.println("First Repeating Element is : "+arr[i]);
                        isFound=true;
                        break;
                    }
                }
                 if(!isFound) {
                 System.out.println("No repeating elements found.");
        }
    }
    
}
