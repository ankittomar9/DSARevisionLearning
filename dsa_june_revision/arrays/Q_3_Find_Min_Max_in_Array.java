package dsa_june_revision.arrays;

public class Q_3_Find_Min_Max_in_Array {
    public static void main(String args[]){
        int[] arr={0,2,4,1,66,33,14,99,40,-5,3};
        //Goal is find Min and Max element in given above array
            minMaxHelper(arr);

    }
    public static void minMaxHelper(int[] arr){
        if(arr==null || arr.length==0){
            System.out.println("Array is null or empty");
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
        System.out.println("maximum value in array is : \n"+max);
        System.out.println("minimum value in array is : \n"+min);
    }
}
