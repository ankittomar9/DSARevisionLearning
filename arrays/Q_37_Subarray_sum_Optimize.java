package DSARevisionLearning.arrays;
public class Q_37_Subarray_sum_Optimize {
    public static void main(String args[]){
        //We optimize using Prefix Sum 
        int arr[]={1,2,3,4,5};         int n=arr.length;
        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                 int s=i;int e=j;
                sum=0;
                    if(s==0){
                        sum=prefix_arr[e];
            }else{
                sum=prefix_arr[e]-prefix_arr[s-1];

            }
             System.out.println("Subarray ( "+s+","+e+" ) : "+sum);
            }               
        }
    }    
}
