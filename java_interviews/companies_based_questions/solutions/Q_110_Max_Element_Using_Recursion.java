package java_interviews.companies_based_questions.solutions;

public class Q_110_Max_Element_Using_Recursion {
    public static void main(String args[]){
        int arr[]={1,4,3,-5,8,6};
         
       System.out.println("The maximum element is: " + findMaxElement(arr));
    }
    public static int findMaxElement(int arr[]){
            if(arr==null ||arr.length==0){
                throw new IllegalArgumentException("Array is empty or null");
          }
            return findMaxHelper(arr,0);
    }

    public static int findMaxHelper(int arr[],int index){
        if(index==arr.length-1) {     
              return arr[index];  
                }
          
        int maxOfRest=findMaxHelper(arr, index+1);
        
        return Math.max(arr[index], maxOfRest);
    }
    
}
