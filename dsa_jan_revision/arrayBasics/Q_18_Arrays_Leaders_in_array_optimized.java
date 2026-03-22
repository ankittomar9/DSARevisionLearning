package dsa_jan_revision.arrayBasics;

public class Q_18_Arrays_Leaders_in_array_optimized {
    /*An Element  is said to be leader if an element is greater to all the elements to its right */
    public static void main(String args[]){
         int arr[]={16,17,4,3,5,2}; 
            int n=arr.length;
            //Since we are using Carry Forward technique what we want is 
            //carry the max value from right think about
            //  why we know why because last element is always a leader
            if (arr==null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }
                int count=1; int max=arr[n-1];
            for(int i=n-2;i>=0;i--){
                if(arr[i]>max){
                    max=arr[i];
                    count++;
                }
            }
            System.out.println("Leader count in array are : \n"+count);
    }
}
