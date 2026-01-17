package DSARevisionLearning.arrays;

public class Q_43_Subarray_Sum_SW_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=3;        int n=arr.length;
        if(n==0){        System.out.println("Array is Empty");  return;        }
        int currentSum=0;

        for(int i=0;i<n-k;i++){
            currentSum=currentSum+arr[i];
        }

        int s=0;int e=k-1;
        while(s<e){
            
            s++;
            e++;
        }

    }
    
}
