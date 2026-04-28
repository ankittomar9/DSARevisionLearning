package dsa_jan_revision.arrayBasics;

public class Q_66_Divisibility_By_3 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
             System.out.println("Evaluating: [1, 2, 3]");
            System.out.println("Result: " + solve(arr1) + "\n");

          int arr2[]={1,0,0,1,2};
            System.out.println("Evaluating: [1, 0, 0, 1, 2]");
        System.out.println("Result: " + solve(arr2) + "\n");
        
    }
    public static int solve(int arr[]){
         if(arr==null || arr.length==0){return 0;}
            int sum=0;
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
         }
         if(sum%3==0){
            return 1;
         }else{
            return 0;
         }
    }
}
