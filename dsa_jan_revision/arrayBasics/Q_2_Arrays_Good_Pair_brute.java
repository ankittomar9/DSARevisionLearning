package dsa_jan_revision.arrayBasics;

public class Q_2_Arrays_Good_Pair_brute {
    public static void main(String args[]){
               int arr[]={1,2,3,4,4,5};   
        int n=arr.length;
        int target=7;
        pairHelper(arr,target);
    }

    public static void pairHelper(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target){
                    count++;
                }

        }
        System.out.println("Count of pairs are :  "+count);
    }
}
