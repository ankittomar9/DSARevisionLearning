package dsa_jan_revision.linked_list;
public class Q_3_Linked_List_Length {
    public static void main(String args[]){
        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=new Node(50);
         head1.next.next.next.next.next=new Node(60);
        System.out.println("Length of Linked List 1 : "+getLength(head1));

        Node head2=null;
        System.out.println("Length of Linked List 1 : "+getLength(head2));
    }
    public static int getLength(Node head){
        int count=0;        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            count++;
            temp=temp.next;
        }
        // System.out.println("null");
         System.out.println();
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
