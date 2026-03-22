package java_interviews.companies_based_questions.solutions;

public class Q_89_String_Permutations {
    public static void main(String args[]){
        String s1="ABC";
        System.out.println("Permutation of '"+s1+"' : ");
        char charsArr[]=s1.toCharArray();
        permute(charsArr,0);
    }
    public static void permute (char charsArr[],int currentIndex){
        if(currentIndex == charsArr.length-1){
            System.out.println(String.valueOf(charsArr));
            return;
        }

        for(int i=currentIndex ; i<charsArr.length;i++){
            swap(charsArr,currentIndex,i);
            permute(charsArr,currentIndex+1);
            swap(charsArr,currentIndex,i);
        }

    }
    public static void swap(char charsArr[],int i,int j){
        char temp= charsArr[i];
        charsArr[i]=charsArr[j];
        charsArr[j]=temp;
    }
}
