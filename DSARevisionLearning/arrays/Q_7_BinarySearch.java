package DSARevisionLearning.arrays;

public class Q_7_BinarySearch {
    public static void main(String args[]){
        int arr[]={10,30,40,60,90,110,120,130};
        int target=110;
        BinarySearchHelper(arr,target);
    }
    public static void BinarySearchHelper(int arr[],int target){
        int n=arr.length;
        int low=0; int high=n-1;
        int  index=-1; boolean isFound=false;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
               index= mid;    
                isFound=true;
                break; 
            }
            else if(arr[mid]>target){
                
                  high=mid-1;
            }
            else{
                   low=mid+1;   
            }

           
        }
         if(isFound){
                 System.out.println("Target found at "+index);
            }else{
                   System.out.println("Target not exists in array");
            }
           
        
    }
}
