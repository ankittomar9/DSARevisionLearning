package dsa_jan_revision.arrayBasics;

public class Q_3_Array_Min_max_Optimized {
    public static void main(String args[]){
        int arr[]={10,99,12,3,4,55,66,71,2,3};
        minMaxFinder(arr);

    }
        public static void minMaxFinder(int arr[]){
                if(arr==null || arr.length==0){
                    System.out.println("Array is null or Empty");
                    return ;
                }
                int max=Integer.MIN_VALUE;
               int min=Integer.MAX_VALUE;

                for(int i=0;i<arr.length;i++){
                    if(arr[i]>max){
                        max=arr[i];
                    }else if(arr[i]<min){
                        min=arr[i];
                    }
                }
                System.out.println("Max value is "+max);
                System.out.println("Min value is "+min);
        }
}
