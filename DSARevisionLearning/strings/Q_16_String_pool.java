package DSARevisionLearning.strings;
public class Q_16_String_pool {
    public static void main(String args[]){
           // String literals - stored in String Pool
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";
        
        // Using new keyword - creates object in Heap memory
        String s4 = new String("Hello");
        
        // Checking references
        System.out.println(s1 == s2);  // true (same reference in String Pool)
        System.out.println(s1 == s3);  // false (different strings)
        System.out.println(s1 == s4);  // false (s4 is in Heap, not String Pool)
        
        // Using equals() - compares content
        System.out.println(s1.equals(s4));  // true (same content)
        
        // intern() method - adds string to pool if not present
        String s5 = new String("Hello").intern();
        System.out.println(s1 == s5);  // true (s5 now refers to String Pool)
        
        // Visualization:
        // String Pool: ["Hello", "World"]
        // Heap: [String object "Hello" (referenced by s4)]
        // s1, s2, s5 -> point to "Hello" in String Pool
        // s3 -> points to "World" in String Pool
        // s4 -> points to separate "Hello" in Heap
    }
    
}
