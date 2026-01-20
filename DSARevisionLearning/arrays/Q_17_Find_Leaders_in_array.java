package DSARevisionLearning.arrays;

public class Q_17_Find_Leaders_in_array {
    public static void main(String agrs[]){
        //An element said to be a leader if all the elements to its right are smaller then him
        //last element is always a leader
          int arr[]={16,17,4,3,5,2}; 
        int n=arr.length;
        
        int max_so_far=arr[n-1];
        int leadersCount=1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max_so_far){
                max_so_far=arr[i];
                leadersCount++;
            }

        }
        System.out.println("Leaders in array are \n"+leadersCount);
    }
}
