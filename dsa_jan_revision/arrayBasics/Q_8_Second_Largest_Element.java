package dsa_jan_revision.arrayBasics;

public class Q_8_Second_Largest_Element {
    public static void main(String args[]){
               int arr[]={10,99,12,3,4,55,66,71,2,3};
               secondLargestFinder(arr);

    }
    public static void secondLargestFinder(int arr[]){
        if(arr==null || arr.length==0) {System.out.println("Array is Empty");return;}
        int max=Integer.MIN_VALUE;
        int second_Max=max;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 second_Max=max;
                max=arr[i];
              //  second_Max=max;
            }
            else if(arr[i]<max && arr[i]>second_Max){
                second_Max=arr[i];
            }
        }
        System.out.println("Max Element in Array is \n"+max);
        System.out.println("Second Max Element in Array is \n"+second_Max);

    }
}
