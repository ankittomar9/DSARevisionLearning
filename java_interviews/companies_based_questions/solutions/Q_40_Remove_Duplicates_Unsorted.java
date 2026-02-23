package java_interviews.companies_based_questions.solutions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
public class Q_40_Remove_Duplicates_Unsorted {
    public static void main(String args[]){
        int arr[]={4,3,2,4,1,3,2};

        System.out.println("Original Array : "+Arrays.toString(arr));
        int[] result=removeDuplicatesHash(arr);
         System.out.println("Unique Array : "+Arrays.toString(result));
    }
    public static int[] removeDuplicatesHash(int arr[]){
        if(arr==null || arr.length==0) return arr;
        LinkedHashSet<Integer> uniqueSet=new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){
            uniqueSet.add(arr[i]);
        }
        List<Integer> tempList=new ArrayList<>(uniqueSet);

        int[] newArr=new int[uniqueSet.size()];

        for(int i=0;i<newArr.length;i++){
           newArr[i]=tempList.get(i);
        }
        return newArr;
    }
    
}
