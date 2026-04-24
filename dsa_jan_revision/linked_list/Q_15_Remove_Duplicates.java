package dsa_jan_revision.linked_list;
public class Q_15_Remove_Duplicates {
    public static void main(String args[]){
Node head1= new Node(10); head1.next=new Node(10);head1.next.next=new Node(20);
 head1.next.next.next=new Node(30); head1.next.next.next.next=new Node(30); 
head1.next.next.next.next.next=new Node(30);
 head1.next.next.next.next.next.next=new Node(30); 
System.out.println(" Original List  : "); printList(head1);  System.out.println();

System.out.println("Removing duplicates..."); head1 = deleteDuplicates(head1);printList(head1);
    }
    public static Node deleteDuplicates(Node head){
        if(head==null || head.next==null){ return head;}
        Node current=head;
        while(current!=null && current.next!=null){
            if(current.data ==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
    public static void printList(Node head){
 Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
 System.out.println("null");}
 public static class Node{
         int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }
}
