package dsa_jan_revision.recursion;

public class Q_8_Linear_Search_recursive {
    public static void main(String[] args) {
        int arr[]={2,4,8,7,2,6,4,9,2,4,5};
        int target=6;int index=0;
        System.out.println("Evaluating Array for target " + target);
        int result= linearSearchHelper(arr,index,target);
        if(result!=-1){
            System.out.println("Element Found at : \n"+result);
        }else{
             System.out.println("Element Does not exists ");        }
    }
    public static int linearSearch(int arr[],int index,int target){
        if(arr==null || arr.length<=1){
            return -1;
        }
               return linearSearchHelper(arr, 0, target);
    }
    public static int linearSearchHelper(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
    
        if(arr[index]==target){
            return index;
        }
        return linearSearchHelper(arr, index+1, target);
    }
}
