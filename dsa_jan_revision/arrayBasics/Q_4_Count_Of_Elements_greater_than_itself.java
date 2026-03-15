package dsa_jan_revision.arrayBasics;

public class Q_4_Count_Of_Elements_greater_than_itself{
    /*Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself. */
    public static void main(String args[]){
        int arr[]={1,2,4,3,10,0,4,6,3,18};
        countElementsHelper(arr);
    }
    public static void countElementsHelper(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Array is null or Empty");return ;        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxCount++;
            }
        }
        int result=arr.length-maxCount;
         System.out.println("Count of Elements having least 1 elements ");
        System.out.println(" greater than itself \n"+result);

    }   
}
