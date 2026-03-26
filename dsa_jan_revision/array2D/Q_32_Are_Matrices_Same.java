package dsa_jan_revision.array2D;
public class Q_32_Are_Matrices_Same {
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
         System.out.println("Matrix 1 ");
         matrixPrintHelper(arr1);
          int arr2[][]={{1,2,3},{4,10,6},{7,8,9}};
          System.out.println("Matrix 2 ");
         matrixPrintHelper(arr2);
         matrixChecker(arr1,arr2);
    }
    public static void matrixChecker(int arr1[][],int arr2[][]){
        if(arr1==null || arr2==null || arr1.length==0 || arr2.length==0){return;}
        boolean isSame=true;
         int n=arr1.length;  
            int m=arr1[0].length;
            for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    isSame=false;
                    break;
                }
             }   
        }
            if(isSame==true){
             System.out.println("matrices are same");
           }   
           else{
              System.out.println("matrices are different");
        }
    }
    public static void matrixPrintHelper(int arr[][]){
        int n=arr.length;
            int m=arr[0].length;
            for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
             }   
            System.out.println();
        }
    }
}
