package dsa_revision_miscellaneous.hashmap;

import java.util.HashMap;

public class Q_6_Find_First_Non_Repeating_Element {
    public static void main(String args[]){
      //  int arr[]={9,6,9,7,4,7,1,3,7};
        int arr[]={9,4,9,6,7,4} ;
        int n=arr.length;        boolean isFound=false;
        if(n==0){
              System.out.println("Empty array");
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println("Frequency Map \n"+map);

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
