package DSARevisionLearning.hashmap;

import java.util.HashMap;

public class Q_12_Sub_array_with_0_Sum {
    public static void main(String args[]){
        int arr[]={4,2,-3,1,6};
        int n=arr.length; boolean isFound=false;
        //expected output is : 2+(-3)+1=0 so true; 
        HashMap<Integer,Integer> map=new HashMap<>();
            int currentSum=0; //int maxSum=Integer.MIN_VALUE;
            
            for(int i=0;i<arr.length;i++){
                currentSum=currentSum+arr[i];

                if(currentSum==0){
                    isFound=true;
                System.out.println("Found subarray with 0 sum ending at index " + i);
                break;    
                }
                
                if(map.containsKey(currentSum)){
                    isFound=true;
                System.out.println("Found subarray with 0 sum between index " 
                                   + (map.get(currentSum) + 1) + " and " + i);                    
                }
                map.put(currentSum, i);

            }

        if (!isFound) {
            System.out.println("No subarray with 0 sum found");
        }
    }
    
}
