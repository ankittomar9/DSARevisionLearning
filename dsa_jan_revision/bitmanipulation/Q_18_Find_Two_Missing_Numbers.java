package dsa_jan_revision.bitmanipulation;
import java.util.Arrays;
public class Q_18_Find_Two_Missing_Numbers {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4}; System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Missing Numbers: " + Arrays.toString(solve(arr1)) + "\n");  

        int arr2[] = {5, 1, 3, 6}; System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Missing Numbers: " + Arrays.toString(solve(arr2)));
    }
    public static int[] solve(int arr[]){
if (arr == null || arr.length < 2) {System.out.println("Invalid input: need at least 2 numbers");
        return new int[]{};    }
        int n=arr.length+2; int xorSum=0;
        for(int num: arr){            xorSum=xorSum^num;        }
        for(int i=1;i<=n;i++){            xorSum=xorSum^i;        }

        int rightMostSetBit=xorSum &-xorSum;
        int bucketA=0; int bucketB=0;

        for(int num : arr){
            if((num & rightMostSetBit)==0){
                                     bucketA =bucketA ^num;   }
                            else{     bucketB =bucketB ^num;  }  }

            for(int i=1;i<=n;i++){
                    if((i & rightMostSetBit)==0){
                                    bucketA =bucketA ^i;    }
                        else{        bucketB =bucketB ^i;    }  }
                        
            if(bucketA<bucketB ){
               return new int[]{bucketA,bucketB};
            }else{ return new int[]{bucketA,bucketB};    }       }      }
