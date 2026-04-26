package dsa_jan_revision.linked_list;

public class Q_17_Reverse_Linked_List_II {
    public static void main(String[] args) {
 Node head1=new Node(10); head1.next=new Node(20); head1.next.next=new Node(30);
head1.next.next.next=new Node(40); head1.next.next.next.next=new Node(50);
 System.out.println("Original List: ");printList(head1);
  System.out.println("\nReversing from position 2 to 4... ");
  head1 = reverseBetween(head1, 2, 4); printList(head1);
         System.out.println("\nEdge Case: Reversing from head (1 to 2)");
  Node head2 = new Node(10); head2.next = new Node(20); head2.next.next = new Node(30);
        printList(head2);System.out.println("Reversed:");
        head2 = reverseBetween(head2, 1, 2);      printList(head2);
    }
    public static Node reverseBetween(Node head,int left,int right){
        if(head==null || left==right){return head;}
        Node dummy=new Node(0); dummy.next=head;
        Node prev=dummy; 
        for(int i=1;i<left;i++){ 
            prev=prev.next;
        }
        Node nodeBeforeSubList =prev; Node current=prev.next; Node subListTail=current;
        Node forward =null;
        for(int i=0;i<right-left+1;i++){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        nodeBeforeSubList.next=prev;
        subListTail.next=current;
        return dummy;    }
 public static void printList(Node head){
Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }   
}
