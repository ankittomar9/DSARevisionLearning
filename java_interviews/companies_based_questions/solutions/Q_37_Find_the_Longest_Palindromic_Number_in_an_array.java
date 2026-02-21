package java_interviews.companies_based_questions.solutions;

import java.util.Arrays;

public class Q_37_Find_the_Longest_Palindromic_Number_in_an_array {
    public static void main(String args[]){
        int arr[]={12, 232, 54545, 999990, 898};
        System.out.println("Array: " + Arrays.toString(arr));
        int result = findLongestPalindrome(arr);

        if (result == -1) {
            System.out.println("No palindromes found in the array.");
        } else {
            System.out.println("Longest Palindromic Number is: " + result);
        }
    }

    public static int findLongestPalindrome(int arr[]){
        if(arr==null || arr.length==0) { return -1;}
        int maxPalindrome=-1;

        for(int i=0;i<arr.length;i++){
          if (isPalindrome(arr[i]) && arr[i] > maxPalindrome) {
                maxPalindrome = arr[i];
            }
        }   
             return maxPalindrome;
    }
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int original =n;
        int reverse=0;

        while(n>0){
            int lastDigit=n%10;
            reverse=lastDigit+(reverse*10);
            n=n/10;
        }
        
        return original==reverse;
    }
    
}
