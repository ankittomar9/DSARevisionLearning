package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_47_Max_Scalar_Product {
    public static void main(String args[]){
        int arr1[]={1,2,6,-5};
        int arr2[]={5,3,4,-2};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        long maxProduct = findMaxScalarProduct(arr1, arr2);
        System.out.println("Maximum Scalar Product: " + maxProduct);
    }
    public static long findMaxScalarProduct(int arr1[],int arr2[] ){
        if (arr1 == null || arr2 == null) {            return 0;
        }
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        long sum=0;
        for(int i=0;i<arr1.length;i++){
          sum = sum + ((long) arr1[i] * arr2[i]);
        }
        return sum;
    }
}
