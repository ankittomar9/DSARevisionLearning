package dsa_jan_revision.arrayBasics;

public class Q_35_Printing_All_SubArrays {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        subArrayPrintingHelper(arr);
    }

    public static void subArrayPrintingHelper(int arr[]){
        if(arr==null || arr.length==0){ return ;}

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" SubArray : ( "+i+ ","+j+" ) : { " );
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                  System.out.println("}");
            }
        }


    }
    
}
