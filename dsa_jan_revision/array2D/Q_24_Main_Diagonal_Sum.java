package dsa_jan_revision.array2D;

public class Q_24_Main_Diagonal_Sum {
    public static void main(String args[]){
        int arr[][]={ {1,2,3,4},
                      {5,6,7,8},
                     {10,11,12,13},
                     {14,15,16,17}};

                    mainDiagonalSumCalculator(arr);
    }

    public static void mainDiagonalSumCalculator(int arr[][]){
        if(arr==null || arr.length==0){return ;}
        // We can also use two loops to caculate the sum 
      //Here is a trick for this we can do this in single loop as i==j 
      // for a square matrix diagonal
      long sum=0;  
      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i][i];
       // System.out.println(sum);
    }

        System.out.println("Sum of Main Diagonal are : "+sum);
    }

}
