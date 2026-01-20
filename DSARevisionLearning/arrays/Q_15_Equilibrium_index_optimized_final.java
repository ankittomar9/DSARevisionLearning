package DSARevisionLearning.arrays;

public class Q_15_Equilibrium_index_optimized_final {
    public static void main(String args[]){
       // int arr[]={};
         int arr[]={-7,1,5,2,-4,3,0};
        int n=arr.length;        boolean isFound=false;          int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        if(n==0){
            System.out.println("Array is empty no Equilibrium index");
            return;
        }
            //Calculate left sum
              int leftSum=0;
              for(int i=0;i<arr.length;i++){
               // we calculate the left sum on fly 
               // rightSum=totalSum -leftSum-arr[i]           //Calculate right sum
                int rightSum=0;
               rightSum=totalSum -leftSum-arr[i];
                if(leftSum==rightSum){
                    System.out.println("Equilibrium index found at "+i);
                      System.out.println("LeftSum : "+leftSum+" == "+rightSum+ " RightSum  " );
                    isFound=true;
                    break;
                }
                leftSum=leftSum+arr[i];
            }
            if(!isFound){
                  System.out.println("Equilibrium index not exists ");
            }
        

    }
    
}
