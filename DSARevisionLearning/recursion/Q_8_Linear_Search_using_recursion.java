package DSARevisionLearning.recursion;
public class Q_8_Linear_Search_using_recursion {
    public static void main(String args[]){
        int arr[]={2,4,8,7,2,6,4,9,2,4,5};
        int target=6;int index=0;
       
        int result= linearSearchHelper(arr,index,target);
        if(result!=-1){
            System.out.println("Element Found at : \n"+result);
        }else{
             System.out.println("Element Does not exists ");        }
    }
    public static int linearSearchHelper(int arr[] ,int index,int target){
        //Base Case
        if(index==arr.length){
            return -1;
        }
        //Main logic
        if(arr[index]==target){
            return index;
        }
         return linearSearchHelper(arr,index+1,target);
            }    
}
/*TC: O(N)
  SC:O(N) 
*/
