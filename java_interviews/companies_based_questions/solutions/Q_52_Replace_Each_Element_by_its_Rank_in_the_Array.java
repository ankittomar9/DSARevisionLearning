package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
import java.util.HashMap;
public class Q_52_Replace_Each_Element_by_its_Rank_in_the_Array {
    public static void main(String args[]){
        int arr[]={20, 15, 26, 2, 98, 6};

          System.out.println("Original Array: " + Arrays.toString(arr));
        replaceWithRank(arr);
        System.out.println("Ranked Array:   " + Arrays.toString(arr));
    }
    public static void replaceWithRank(int arr[]){
        if(arr==null || arr.length == 0) return;
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        HashMap<Integer,Integer> rankMap=new HashMap<>();
        int currentRank=1;
        
        for(int i=0;i<temp.length;i++){
                if (!rankMap.containsKey(temp[i])) {
                rankMap.put(temp[i], currentRank);
                currentRank++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=rankMap.get(arr[i]);
        }
    }
}
