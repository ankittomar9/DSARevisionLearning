package dsa_jan_revision.linked_list;

public class Q_18_Swap_Nodes_In_Pairs {
    public static void main(String args[]){
    Node head1 =new Node(10);head1.next=new Node(20);head1.next.next=new Node(30);
    head1.next.next.next=new Node(40);head1.next.next.next.next=new Node(50);
    System.out.println("Original List 1 : "); printList(head1);  
        //Test case for Even Length List
    System.out.println("Swapping Pairs of List : "); head1=swapPairs(head1);
    System.out.println("\nEdge Case (Even Length):"); printList(head1);  
           //Test case for Odd Length List
    Node head2=new Node(10); head2.next=new Node(20);
    head2.next.next=new Node(30);
    System.out.println("\nEdge Case (Odd Length):");
    System.out.println("\nOriginal List 2: "); printList(head2);  
    System.out.println("Swapping Pairs of List : "); head2=swapPairs(head2);printList(head2);  
    }
    public static Node swapPairs(Node head){
        Node dummy=new Node(0); dummy.next=head; Node prev=dummy;
        while(prev.next!=null && prev.next.next !=null ){
            Node first =prev.next; Node second=prev.next.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return dummy.next;
    }
public static void printList(Node head){
 Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
 System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }
}

