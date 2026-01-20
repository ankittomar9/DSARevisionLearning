package DSARevisionLearning.arrays;
public class Q_15_Arrays_Equilibrium_index_brute{
    public static void main(String args[]){
       int arr[]={-7,1,5,2,-4,3,0};
            int n=arr.length;    
            boolean isFound=false;
            if (n == 0) {
                    System.out.println("Empty array - no equilibrium index");
                    return;
                }
            for(int i=0;i<arr.length;i++){
                //Calculate left sum
                int leftSum=0;
                for(int j=0;j<i;j++){
                    leftSum=leftSum+arr[j];
                }

                 //Calculate right sum
                int rightSum=0;
                for(int j=i+1;j<n;j++){
                    rightSum=rightSum+arr[j];
                }

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

// Brute force: O(n²) time, O(1) space