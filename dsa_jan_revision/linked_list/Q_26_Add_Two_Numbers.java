package dsa_jan_revision.linked_list;

public class Q_26_Add_Two_Numbers {
    public static void main(String[] args) {
         Node l1=new Node(2); l1.next=new Node(4); l1.next.next=new Node(3);
        Node l2=new Node(5); l2.next=new Node(6); l2.next.next=new Node(4);
    System.out.print("List 1 (342): \n"); printList(l1);
    System.out.print("List 2 (465): \n"); printList(l2);
     Node sum1 = addTwoNumbers(l1, l2);
        System.out.print("Result (807): "); printList(sum1);
         // --- Test Case 2: Unequal Lengths 
        Node l3 = new Node(9); l3.next = new Node(9); l3.next.next = new Node(9);
    Node l4 = new Node(1);System.out.println("\nEdge Case: Differing Lengths & Final Carry");
         System.out.print("List 3 (999): \n"); printList(l3);
        System.out.print("List 4 (1): \n"); printList(l4);System.out.println("Adding lists...");
        Node sum2 = addTwoNumbers(l3, l4);
        System.out.print("Result (1000): \n"); printList(sum2);
}
    public static Node addTwoNumbers(Node l1,Node l2){
        Node dummy =new Node(0); Node tail=dummy; int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int val1=(l1!=null) ? l1.data :0; int val2=(l2!=null) ? l2.data :0;
            
            int sum=val1+val2+carry;
            carry=sum/10;
            tail.next=new Node(sum%10);
            tail=tail.next;

            if(l1!= null )l1=l1.next;if(l2!= null )l2=l2.next;        }
        return dummy.next;    }
public static void printList(Node head){
Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }    
}
