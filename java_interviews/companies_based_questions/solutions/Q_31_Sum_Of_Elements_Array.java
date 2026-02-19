package java_interviews.companies_based_questions.solutions;

public class Q_31_Sum_Of_Elements_Array {
    public static void main(String args[]){
        long arr[]={1,2,3,4,5};
        sumHelper(arr);
    }

    public static void sumHelper(long arr[]){
        if(arr==null || arr.length==0){return ;}
        long n=arr.length;
        long sum=0;
        for(long i=0;i<n;i++){
            sum=sum+arr[(int) i];
        }

        System.out.println(sum);
    }
    
}
