package DSARevisionLearning.sorting;
import java.util.Arrays;
public class Q_1_Bubble_Sort_Rev {
    public static void main(String args[]){
        int arr[]={4,1,5,2,3,7,9};
         System.out.println("Original Array \n "+Arrays.toString(arr));
        int n=arr.length; boolean swapped=false;
           if(n==0){            System.out.println("Array is Empty");return ;           } 

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                     swapped=true;
                }
            }
            if(!swapped){ break;}
        }
        if(swapped==true){
                  System.out.println("Sorted array In ascending \n"+Arrays.toString(arr));
            }else{
                  System.out.println("Array is already sorted ");
            }
    }
    
}
