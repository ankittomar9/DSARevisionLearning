package DSARevisionLearning.arrays;

public class Q_6_Linear_Search {
    public static void main(String args[]){
        int arr[]={10,50,10,2,5,60,3,4,0,60,3};
        int target=60;
        
        LinearSearchHelper(arr,target);
        
    }
    public static void  LinearSearchHelper(int arr[],int target){
        int n=arr.length; boolean isFound=false; int count=0;
      //  System.out.println("Array length "+n);
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                isFound=true;
                count++;
            }
        }
        if(isFound==true){
            System.out.println("target exists in array");
              System.out.println("It appears "+count+ " times");   
        }
        else{
              System.out.println("target does not exists in array");
        }
    }
    
}

/*
TC: O(n)
SC :O(1)
SC :O(n) if we want all the appearances in the array we will need a list to store the indexes
*/