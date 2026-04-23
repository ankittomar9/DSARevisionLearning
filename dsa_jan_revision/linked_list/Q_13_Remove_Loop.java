package dsa_jan_revision.linked_list;
public class Q_13_Remove_Loop {
    public static void main(String args[]){
Node head1= new Node(10); head1.next=new Node(20);head1.next.next=new Node(30);
 head1.next.next.next=new Node(40); head1.next.next.next.next=new Node(50); 
      //     System.out.println(" Original List  : "); printList(head1);  System.out.println(); causes infinite loop
           head1.next.next.next.next.next = head1.next.next; // Create loop at 30
            System.out.println("Repairing the list...");
             removeLoop(head1);
           System.out.println("Repaired List:");
             printList(head1); // Safe to print now!
    }
    public static void removeLoop(Node head){
        if(head==null || head.next ==null ) return;
        Node slow =head;        Node fast=head;        boolean loopExists=false;
        while(fast!=null && fast.next!=null ){
            slow=slow.next; 
            fast=fast.next.next;
            if(fast==slow){         loopExists=true;break;            }        }
        if(!loopExists){return;} // If no loop was found, the list is already safe. Exit.
        if(slow==head){
            while(fast.next!=slow){
                fast=fast.next;
            }
            fast.next=null;
        }else{
            slow=head;
              while(slow.next!=fast.next){
               slow=slow.next ;  fast=fast.next;
            }
            fast.next=null; }   
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }   
        System.out.println("null");
    }
    public static class Node{
         int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }
}
