package DSARevisionLearning.arrays;

public class Q_2_A_good_pair_two_Sum_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,4,5,6};
     //   int arr[]={3,3,3}; target =6 
        int target=7;  int n=arr.length;
        //find the pairs where arr[i]+arr[j]=k; and i!=j
       // List<Integer> list=new ArrayList<>();
       int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }

        }
        System.out.println("total pairs are \n"+count);

    }
    
}

/*
    tc O(N^2)
    SC : O(1) 
    but if we want the pair indexes we need to store them in list or array
    so SC:O(N)
*/