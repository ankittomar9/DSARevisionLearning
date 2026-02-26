package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_48_Min_Scalar_Product_Of_two_vectors {
    public static void main(String args[]){
         int arr1[]={1,2,6,-5};
        int arr2[]={5,3,4,-2};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
       long minProduct = findMinScalarProduct(arr1, arr2);
        System.out.println("Minimum Scalar Product: " + minProduct);
    }
     public static long findMinScalarProduct(int arr1[],int arr2[] ){
        if (arr1 == null || arr2 == null) {            return 0;
        }
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        Arrays.sort(arr1);        Arrays.sort(arr2);

        long sum=0;
          int n=arr1.length;
        // for (int i = 0, j = n - 1; i < n; i++, j--) {
        //     // Multiply smallest with largest
        //     sum = sum + ((long) arr1[i] * arr2[j]);
        // }
        int i=0; int j=n-1;
        while(i<n){
                 sum = sum + ((long) arr1[i] * arr2[j]);
            i++;j--;
        }
        return sum;
    }
}
