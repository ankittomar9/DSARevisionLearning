package dsa_jan_revision.linked_list;
public class Q_10_Reverse_a_LinkedList {
    public static void main(String args[]){
 Node head1=new Node(10);head1.next=new Node(20);head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);head1.next.next.next.next=new Node(50);
          System.out.println("Original List : "); printList(head1);  System.out.println();

                 System.out.println("Reverse List : "); head1=reverseLinkedList(head1);
                 printList(head1);  System.out.println();
    }
    public static Node reverseLinkedList(Node head){
        Node current=head; Node previous=null;Node forward=null; 
         while(current!=null){
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;
         }   
         return previous;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
            System.out.println(" null ");
    }
    public static  class Node{
        int data;        Node next;
        public Node(int data){
            this.data=data;this.next=null;        }    }    }
