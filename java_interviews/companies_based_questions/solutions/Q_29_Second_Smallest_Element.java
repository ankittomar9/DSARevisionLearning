package java_interviews.companies_based_questions.solutions;

public class Q_29_Second_Smallest_Element {
    public static void main(String args[]){
        int arr[]={10,4,32,99,46,3,55,14};
        secondSmallestFinder(arr);
    }
     public static void secondSmallestFinder(int arr[]){
            if(arr==null || arr.length<2){
                System.out.println("Array must have at least 2 elements");  return;            }                        
                    int min=Integer.MAX_VALUE;
                    int secondMin=min;
                 for(int i=0;i<arr.length;i++){
                    if(arr[i]<min){
                       secondMin=min;
                        min=arr[i];
                    }
                
                  
                    else if(arr[i]!=min && arr[i]<secondMin){
                        secondMin=arr[i];
                    }
                }
                System.out.println("First min : "+min);
                System.out.println("Second min :"+secondMin);
  }
        
}


/*TC : is O(N)
  SC :  is O(1)  

  Approach 1 : Use two Loops for max and min
  Approach 2 : sort and first element is min second element is second min
  */