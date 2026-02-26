package java_interviews.companies_based_questions.solutions;

import java.util.HashMap;

public class Q_49_Find_the_Symmetric_Pairs_in_an_Array {
    public static void main(String args[]){
        int pairs[][]={{11,20},{30,40},{5,10},{40,30},{10,5}};
        System.out.println("Symmetric pairs found:");
        findSymmetricPairs(pairs);

    }
    public static void findSymmetricPairs(int arr[][]){
          if(arr==null || arr.length ==0) return ;

          HashMap<Integer,Integer> map=new HashMap<>();

          for(int i=0;i<arr.length;i++){
              int first=arr[i][0];
              int second=arr[i][1];

            Integer storedValue =map.get(second);
            if(storedValue !=null  && storedValue == first){
                System.out.println("(" + second + ", " + first + ")");
            }else{
                map.put(first, second);
            }

          }
    }
}
