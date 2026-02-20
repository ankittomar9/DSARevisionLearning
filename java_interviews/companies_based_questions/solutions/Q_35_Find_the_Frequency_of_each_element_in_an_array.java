package java_interviews.companies_based_questions.solutions;

import java.util.HashMap;

public class Q_35_Find_the_Frequency_of_each_element_in_an_array {
    public static void main(String args[]){
        int arr[]={10, 20, 20, 10, 10, 30};
        //HashMap Apporach Interview way
        System.out.println("--- HashMap Approach ---");
        countFrequenciesMap(arr);
    }
    public static void countFrequenciesMap(int arr[]){
        if(arr==null || arr.length==0){return ;}
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], i)
            }
        }
    }
}
