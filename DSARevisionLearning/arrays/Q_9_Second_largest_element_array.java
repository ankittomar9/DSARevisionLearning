package DSARevisionLearning.arrays;

public class Q_9_Second_largest_element_array {
    public static void main(String args[]){
        //Forced brute force will be two loops checking 1st and 2nd max
        //Optimized check in single pass
        int arr[]={10,99,4,5,66,3,44,8};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>second_max){
                second_max=arr[i];
            }
        }
        System.out.println("max element : "+max);
        System.out.println("second_max element : "+second_max);
    }  
}
