package java_interviews.companies_based_questions.solutions;
import java.util.Arrays;
public class Q_54_Majority_Element {
    public static void main(String args[]){
        int arr[]={2, 2, 1, 1, 1, 2, 2};
        System.out.println("Array: " + Arrays.toString(arr));
        
        int majority = findMajorityElement(arr);
                if (majority != -1) {
            System.out.println("The Majority Element is: " + majority);
        } else {
            System.out.println("No Majority Element exists in the array.");
        }
        
    }
    public static int  findMajorityElement(int arr[]){
        if(arr==null || arr.length==0){            return -1;        }
        int candidate=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }else if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }

        int verificationCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                verificationCount++;
            }
        }
        if(verificationCount>arr.length/2){
            return candidate;
        }
        return -1;
    }
}
