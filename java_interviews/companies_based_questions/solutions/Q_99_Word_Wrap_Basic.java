package java_interviews.companies_based_questions.solutions;

public class Q_99_Word_Wrap_Basic {
    public static void main(String args[]){
        String text="The quick brown fox jumps over the lazy dog";
        int k=10;
        System.out.println("Wrapped Text (Limit " + k + "):");
        System.out.println("-------------------");
        System.out.println(wrapText(text, k));
        System.out.println("-------------------");
    }
    public static String wrapText(String str ,int k){
        if(str==null || str.isEmpty()){return "";}

        String word[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        int currentLength=0;

        for(int i=0;i<word.length;i++){
            
            if(currentLength + word[i].length()>k){
                sb.replace(sb.length()-1,sb.length(),"\n");
                sb.append(word[i]).append(" ");
                currentLength= word[i].length()+1;
            }else{
                sb.append(word[i]).append(" ");
                currentLength=currentLength+word[i].length()+1;
            }
        }
        return sb.toString().trim();
    }
}
