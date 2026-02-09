package DSARevisionLearning.strings;

public class Q_15_String_Immutability_example {
    public static void main(String args[]){
        
        String s1 = "Hello";
        System.out.println("Original: " + s1);  // Output: Hello
        System.out.println("HashCode: " + s1.hashCode());
        
        // Attempting to modify - actually creates a new String
        s1 = s1.concat(" World");
        System.out.println("Modified: " + s1);  // Output: Hello World
        System.out.println("HashCode: " + s1.hashCode());  // Different hashcode
        
        // Another example
        String s2 = "Java";
        String s3 = s2;  // Both point to same object
        s2 = s2 + " Programming";  // Creates new object
        
        System.out.println("s2: " + s2);  // Output: Java Programming
        System.out.println("s3: " + s3);  // Output: Java (unchanged)
    }
}
    
    

