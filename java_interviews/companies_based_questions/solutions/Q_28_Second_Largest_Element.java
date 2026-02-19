package java_interviews.companies_based_questions.solutions;

public class Q_28_Second_Largest_Element {
    public static void main(String args[]){
        int arr[]={10,4,32,99,46,3,55,14};
        secondLargestFinder(arr);
    }
    public static void secondLargestFinder(int arr[]){
        if(arr==null || arr.length==0){
            System.out.println("Empty array"); return;
        }
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int secondMax=max;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
               secondMax=max;
               max=arr[i];
            }

           else if(arr[i]!=max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }

        System.out.println("First max : "+max);
          System.out.println("Second max :"+secondMax);
        
    }
}


/*TC : is O(N)
  SC :  is O(1)  

  Approach 1 : Use two Loops for max and min
  Approach 2 : sort and last second element is second max
  */