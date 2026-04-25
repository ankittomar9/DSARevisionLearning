package dsa_jan_revision.linked_list;
public class Q_22_Intersection_Of_Linked_Lists {
    public static void main(String[] args) {
 Node intersect=new Node(30);intersect.next=new Node(40);  
  System.out.println("Intersect List  : "); printList(intersect); 
    
 Node headA=new Node(10);headA.next=new Node(20);
        headA.next.next=intersect; System.out.println("Original List 1 : "); printList(headA);  
          Node headB=new Node(99);headB.next=new Node(88);
           headB.next.next = new Node(77); headB.next.next.next = intersect;

            System.out.println("Original List 2 : "); printList(headB);  
         System.out.println("Testing Intersecting Lists:");
        Node result1 = getIntersectionNode(headA, headB);
        if (result1 != null) {
            System.out.println("Intersection found at Node with value: \n" + result1.data);
        } else {
            System.out.println("No intersection found.");        }             }

    public static Node getIntersectionNode(Node headA,Node headB){
        if(headA==null || headB==null) {return null;}
        Node ptrA=headA; Node ptrB=headB;
        while(ptrA!=ptrB){
            if(ptrA==null){ptrA=headB;}
            else {ptrA=ptrA.next;}
            if(ptrB==null){ptrB=headA;}
            else{ ptrB=ptrB.next;}
        }
        return ptrA;    }
 public static void printList(Node head){
Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }    
}
