package dsa_jan_revision.arrays;

public class Q_2_Arrays_Good_pair_two_sum_brute {
    public static void main(String[] args){
        int arr[]={1,4,2,3,6,5,4}; int target=7;
             //Find pairs which follows this arr[i]+arr[j]==target
        int count=0;
      
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               
                if(arr[i]+arr[j]==target ){
                    System.out.println("pairs ( "+arr[i]+ " "+arr[j]+" )");
                    count++;
                }

            }
        }

        System.out.println("Total Pairs are \n" + count);
    }
    
}

/*TC O(n^2) 
    SC : O(1)
*/