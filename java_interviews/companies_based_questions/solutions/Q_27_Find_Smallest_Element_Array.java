package java_interviews.companies_based_questions.solutions;

public class Q_27_Find_Smallest_Element_Array {
    public static void main(String args[]){
        int arr[]={10,4,32,99,46,3,55,14};

         int result= smallestElementFinder(arr);
         System.out.println("Smallest element is: "+result);
    }
    public static int smallestElementFinder(int arr[]){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
         if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Array is empty");
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
    }
}


/*TC : is O(N)
  SC :  is O(1)  
*/