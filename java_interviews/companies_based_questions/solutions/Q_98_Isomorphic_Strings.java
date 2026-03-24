package java_interviews.companies_based_questions.solutions;
public class Q_98_Isomorphic_Strings {
    public static void main(String args[]){
        String s1="egg"; String t1="add";
        String s2="foo";String t2="bar";
         String s3="paper";String t3="title";
         
         System.out.println("Are '" + s1 + "' & '" + t1 
         + "' isomorphic? " + isIsomorphic(s1, t1));
        System.out.println("Are '" + s2 + "' & '" + t2 
        + "' isomorphic? " + isIsomorphic(s2, t2));
        System.out.println("Are '" + s3 + "' & '" + t3 
        + "' isomorphic? " + isIsomorphic(s3, t3));
    }
    public static boolean isIsomorphic(String str ,String t){
        if(str == null || t==null ||str.length()!=t.length()){return false;}
        int mapstr[]=new int[256];
        int mapt[]=new int[256];

        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            char c2=t.charAt(i);

            if(mapstr[c1]!=mapt[c2]){ return false;} 
            
            mapstr[c1]=i+1;
            mapt[c2]=i+1;
        
        }
        return true;
    }
}
