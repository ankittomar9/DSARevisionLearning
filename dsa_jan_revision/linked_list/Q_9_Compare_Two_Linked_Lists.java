package dsa_jan_revision.linked_list;
public class Q_9_Compare_Two_Linked_Lists {
    public static void main(String args[]){
 Node head1=new Node(10);head1.next=new Node(20);head1.next.next=new Node(30);
 Node head2=new Node(10);head2.next=new Node(20);head2.next.next=new Node(30);
 Node head3=new Node(10);head3.next=new Node(99);head3.next.next=new Node(30);
 Node head4=new Node(10);head4.next=new Node(20);
            System.out.println("Original List 1: "); printList(head1);  System.out.println();
            System.out.println("Original List 2: "); printList(head2);  System.out.println();
            System.out.println("Original List 3: "); printList(head3);  System.out.println();
            System.out.println("Original List 4: "); printList(head4);  System.out.println();
 System.out.println("Are List 1 and List 2 identical? " + compareLists(head1, head2));
 System.out.println("Are List 1 and List 3 identical? " + compareLists(head1, head3));
 System.out.println("Are List 1 and List 4 identical? " + compareLists(head1, head4));
 }
    public static boolean compareLists(Node head1,Node head2){
        Node temp1=head1; Node temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        boolean result = (temp1== null && temp2==null);
        return result;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static class Node{
        int data;    Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
