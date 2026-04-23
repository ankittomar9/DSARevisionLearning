package dsa_jan_revision.linked_list;
public class Q_14_Remove_Nth_Node_From_List_End {
    public static void main(String args[]){
    Node head1= new Node(10); head1.next=new Node(20);head1.next.next=new Node(30);
 head1.next.next.next=new Node(40); head1.next.next.next.next=new Node(50); 
       System.out.println(" Original List  : "); printList(head1);  System.out.println();
       System.out.println("Removing 2nd node from end...");head1 = removeNthNodeFromEnd(head1, 2);    
        printList(head1);

    }
    public static Node removeNthNodeFromEnd(Node head,int n){
        Node dummy=new Node(50);
        dummy.next=head;  Node slow=dummy; Node fast=dummy;// 1. Create the dummy node to handle the "deleting the head" edge case safely
        for(int i=0;i<=n;i++){// 2. Pull the "measuring tape" to create a gap of n + 1 steps
            if(fast!=null){
                fast=fast.next;
            }
        }// 3. Slide the tight string down the list at 1x speed
        while(fast!=null ){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;// 4. fast hit the wall! slow is now right behind the target. Cut it out.
        return dummy.next;
    }
    public static void printList(Node head){
 Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} System.out.println("null");    }
 public static class Node{
         int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }
}
