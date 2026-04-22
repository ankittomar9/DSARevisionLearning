package dsa_jan_revision.linked_list;
public class Q_12_Middle_of_Linked_List {
    public static void main(String args[]){
        Node head1=new Node(10); head1.next=new Node(20);head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);head1.next.next.next.next=new Node(50);
            System.out.println(" Odd List  : "); printList(head1);  System.out.println();
        
            Node midOdd=findMiddle(head1);
           System.out.println("Odd List Middle: " + (midOdd != null ? midOdd.data : "null"));

            Node head2=new Node(10); head2.next=new Node(20);head2.next.next=new Node(30);
head2.next.next.next=new Node(40);head2.next.next.next.next=new Node(50);
 head2.next.next.next.next.next=new Node(60);System.out.println("Even List  : ");printList(head2);  System.out.println();
             
    Node midEven = findMiddle(head2);
             System.out.println("Even List Middle: " + (midEven != null ? midEven.data : "null"));
}
    public static Node findMiddle(Node head){
        Node slow=head; Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }        return slow;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");            temp=temp.next;        }
        System.out.println(" null ");
    }
      public static class Node{
int data; Node next;  public Node(int data){  this.data=data; this.next=null;  }    }  
}
