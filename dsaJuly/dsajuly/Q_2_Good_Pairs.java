package dsaJuly.dsajuly;

public class Q_2_Good_Pairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,5};
        int target=7;
        goodPairsHelper(nums, target);
    }
    public static void goodPairsHelper(int[] nums,int k){
        if(nums==null || nums.length==0){
            System.out.println("Array is null  or empty");
        }
        int pairCount=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k && i!=j){
                    pairCount++;
                      System.out.println("Pairs are : ("+i+", "+j+")");
                }    
              
            }
        }
          System.out.println("Total Good Pairs are : "+pairCount);
    }
}
