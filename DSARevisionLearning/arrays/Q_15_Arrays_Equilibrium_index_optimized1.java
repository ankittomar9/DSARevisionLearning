package DSARevisionLearning.arrays;
public class Q_15_Arrays_Equilibrium_index_optimized1 {
    public static void main(String args[]){
         int arr[]={-7,1,5,2,-4,3,0};
        int n=arr.length;     
           boolean isFound=false;
        if(n==0){
            System.out.println("Array is empty no Equilibrium index");    
                    return;   
                     }
        //Optimization using prefix arr
        int prefix_arr[]=new int[n];
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
                //Calculate left sum
                int leftSum=0;
                if(i==0){
                    leftSum=0;
                }else{
                     leftSum=prefix_arr[i-1];                }
                 //Calculate right sum
                int rightSum=0;int totalSum=prefix_arr[n-1];
               rightSum=totalSum-prefix_arr[i];

                if(leftSum==rightSum){
                    System.out.println("Equilibrium index found at "+i);
                      System.out.println("LeftSum : "+leftSum+" == "+rightSum+ " RightSum  " );
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                  System.out.println("Equilibrium index not exists ");
            }
      }
    
}
