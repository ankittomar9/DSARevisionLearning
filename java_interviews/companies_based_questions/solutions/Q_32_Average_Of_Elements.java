package java_interviews.companies_based_questions.solutions;

public class Q_32_Average_Of_Elements {
    public static void main(String args[]){
        int arr[]={10 ,20, 30,41};

        System.out.println("Average is: " + findAverage(arr));
    }
    public static double findAverage(int[] arr){
        if(arr==null || arr.length==0){
            return 0.0;
        }
        long sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        return (double) sum/arr.length;
    }
    
}
