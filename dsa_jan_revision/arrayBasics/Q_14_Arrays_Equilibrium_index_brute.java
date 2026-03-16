package dsa_jan_revision.arrayBasics;

public class Q_14_Arrays_Equilibrium_index_brute {
        public static void main(String args[]){
             int arr[]={-7,1,5,2,-4,3,0};
                boolean isFound=false;
             for(int i=0;i<arr.length;i++){

                //Left Sum
                int leftSum=0;
                for(int j=0;j<i;j++){
                    leftSum=leftSum+arr[j];
                }

                // Right Sum
                int rightSum=0;
                for(int j=i+1;j<arr.length;j++){
                    rightSum=rightSum+arr[j];
                }
                if(leftSum == rightSum){
                    System.out.println("Equilibrium Index found at "+i);
                      System.out.println("Left Sum "+leftSum+" == "+rightSum +" Right Sum");
                    isFound=true;
                    break;
                }
                 
                 }
                 if(isFound==false){
                System.out.println("Equilibrium index Does not exists" );
             }

        }
}
