package DSARevisionLearning.binarySearch;
public class Q_1_Binary_Search {
    public static void main(String args[]){
        int arr[]={1,5,7,20,55,60,72,85,99};
        //Note for Binary Search to work Search Space should be sorted
        int target=60;
        binarySearchHelper(arr,target);
    }
    public static void binarySearchHelper(int arr[],int target){
            int n=arr.length;  
            int low=0;int high=n-1;
            int result=0; boolean isFound=false;
            while(low<=high){
                int mid=low+(high-low)/2;

                if(arr[mid]==target){
                    result=mid;
                    isFound=true; break;
                }   
                if(arr[low]<target){
                  low=mid+1;
                }else{
                   high=mid-1;
                }
            }
          //   System.out.println("Target  Exists at : "+result);
            if(isFound){
                System.out.println("Target  Exists at Index : "+result);
            } else{
                  System.out.println("Target Doesn't Exists");
            }
    }
    
}
