package DSARevisionLearning.arrays;

public class Q_3_Arrays_find_Min_Max {
    public static void main(String args[]){

        int arr[]={10,2,4,-5,99,3,1,6,66};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Max Value \n "+max);
         System.out.println("Min Value \n "+min);
    }
    
}
