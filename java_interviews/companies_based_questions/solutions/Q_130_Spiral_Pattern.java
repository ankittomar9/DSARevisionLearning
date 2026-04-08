package java_interviews.companies_based_questions.solutions;
public class Q_130_Spiral_Pattern {
    public static void main(String args[]){
        int N=4;
        System.out.println("Spiral Matrix for N = " + N + ":\n");
        printSpiral(N);
    }
    public static void printSpiral(int N){
        int matrix[][]=new int[N][N];
        int top=0; int bottom=N-1;int left=0;int right=N-1;
        int count=1;

        while(top<=bottom && left<=right){
            //pass 1
            for(int i=left; i<=right;i++) {
                matrix[top][i]=count++;
            }
            top++;
            //pass 2
            for(int i=top;i<=bottom;i++) {
                matrix[i][right]=count++;
            }
            right--;
            //pass 3
            if (top<=bottom) {
                for (int i= right; i>= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--; // Shrink bottom boundary inward
            }

            //pass 4
            if (left <= right) {
                for (int i=bottom; i>=top;i--) {
                    matrix[i][left]=count++;
                }
                left++; // Shrink left boundary inward
            }
            for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t"); // \t adds clean tab spacing
            }
            System.out.println();
        }

        }

    }
}
