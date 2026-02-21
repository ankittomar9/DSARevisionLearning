package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Q_36_Sort_elements_by_Frequency {
    public static void main(String args[]){
        int arr[]={2, 5, 2, 8, 5, 6, 8, 8};
        //Expected Output : [8, 8, 8, 2, 2, 5, 5, 6]
        System.out.println("Original: " + Arrays.toString(arr));
        sortByFrequency(arr);
        System.out.println("Sorted:   " + Arrays.toString(arr));
    }
    public static void sortByFrequency(int arr[]){
        if(arr==null || arr.length==0) {return;}
    
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
    
        Integer[] objArr=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            objArr[i]=arr[i];
        }
        
       Arrays.sort(objArr, (n1, n2) -> {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);
    
            if (freq1 != freq2) {
                return freq2 - freq1; 
            }
            
            else {
                return n1 - n2; 
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }
    
}
