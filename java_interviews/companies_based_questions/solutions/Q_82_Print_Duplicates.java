package java_interviews.companies_based_questions.solutions;

public class Q_82_Print_Duplicates {
    public static void main(String args[]){
        String s1="programming";

        System.out.println("Original String : \n"+s1);
        System.out.print("Modified String : \n");
        printDuplicate(s1);
    }

    public static void printDuplicate(String str){
        if(str==null || str.isEmpty()) return;

        int freq[]=new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        boolean found=false;
        for(int i=0;i<256;i++){
            if(freq[i]>1){
                System.out.println((char) i + " ");
                found =true;
            }
        }
        if(!found){
            System.out.println("None Found. ");
        }
        System.out.println();
    }
}
