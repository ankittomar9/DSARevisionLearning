package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;
import java.util.HashSet;

public class Q_44_Find_the_repeating_element_array {
    public static void main(String agrs[]){
        int arr[]={1,5,3,4,3,6,5};
        System.out.println("Array: " + Arrays.toString(arr));
        int result=findFirstRepeating(arr);

        if (result != -1) {
            System.out.println("The first repeating element found is: " + result);
        } else {
            System.out.println("No repeating elements exist in the array.");
        }
    }
    public static int findFirstRepeating(int arr[]){
        if(arr==null || arr.length<=1) return -1;   

         HashSet<Integer> seenNumbers=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(seenNumbers.contains(arr[i])){
                return arr[i];
            }
             seenNumbers.add(arr[i]);
        }
       return -1;
    }
       
        
}
