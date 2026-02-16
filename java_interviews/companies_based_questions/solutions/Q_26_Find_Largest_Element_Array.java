package java_interviews.companies_based_questions.solutions;

public class Q_26_Find_Largest_Element_Array {
    /*Appraoch we could have done this question in Logn time only
     if array was sorted otherwise O(n) is best time complexity */
    public static void main(String args[]){
         int arr[]={1,4,32,99,46,3,55,14};

        int result= findLargest(arr);
         System.out.println("Largest element is: "+result);
    }
        public static int findLargest(int arr[]){
            if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Array is empty");
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                max=arr[i];
                }
            }
            
            return max;
        }
   
}

/*TC : is O(N)
  SC :  is O(1)  
*/