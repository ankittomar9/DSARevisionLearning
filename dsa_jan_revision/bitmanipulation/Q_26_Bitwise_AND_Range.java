package dsa_jan_revision.bitmanipulation;

public class Q_26_Bitwise_AND_Range {
    public static void main(String[] args) {
         int left1=9, right1=12;
        System.out.println("Evaluating Range: [" + left1 + ", " + right1 + "]");
        System.out.println("Resulting AND sum: " + solve(left1, right1) + "\n");
        
        int left2=5, right2=7;
        System.out.println("Evaluating Range: [" + left2 + ", " + right2 + "]");
        System.out.println("Resulting AND sum: " + solve(left2, right2));  
    }
    public static int solve(int left,int right){
        if (left < 0 || right < 0) return 0;
        int shiftCount=0;
        // while(left<right){
        //     left= left >> 1;
        //     right =right >> 1;
        //     shiftCount++;
        // int result =left << shiftCount;
        // return result;
        // }
        while (right>left) {
        right = right & (right - 1);
        }
          return right;     
    }
}
