package dsa_jan_revision.arrayBasics;
import java.util.Arrays;
public class Q_58_Majority_element {
    public static void main(String[] args) {
          int arr[]={2,2,1,1,1,2,2};
          System.out.println("Original Array: "  + Arrays.toString(arr));
           // n=7 majority is n/2 which is 7/2= 3.5 =3
        //This questions solved by Moore Voting algorithm
        majorityElementHelper(arr);
    }
    public static void majorityElementHelper(int arr[]){
        if(arr==null || arr.length==0){System.out.println("Empty or null array"); return;}
        int count=0; int candidate=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        //verification 
        int freqCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){freqCount++; } }
            if(freqCount > n/2) {
            System.out.println("Majority Element is: " + candidate);
           } else {
            System.out.println("No Majority Element found");
        }
    }
}
