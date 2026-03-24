package java_interviews.companies_based_questions.solutions;

import java.util.Stack;

public class Q_100_Balanced_Parentheses {
    public static void main(String args[]){
        String str1="{[()]}";
        String str2="{[(])]}";
        String str3="(((";
         System.out.println("Is '" + str1 + "' balanced? " + isValid(str1));
        System.out.println("Is '" + str2 + "' balanced? " + isValid(str2));
        System.out.println("Is '" + str3 + "' balanced? " + isValid(str3));
    }
    public static boolean isValid(String s){
        if(s==null || s.length()%2!=0){return false;}

        Stack<Character> stack =new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                stack.push(')');
            }else if(ch=='{'){
                stack.push('}');
            }else if(ch=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || stack.pop() !=ch){return false;}
            }
        }
        return stack.isEmpty();
    }
}
