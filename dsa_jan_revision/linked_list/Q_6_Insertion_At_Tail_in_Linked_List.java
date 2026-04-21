package dsa_jan_revision.linked_list;
public class Q_6_Insertion_At_Tail_in_Linked_List {
    public static void main(String args[]){
     Node node=new Node(10);  node.next=new Node(20);node.next.next=new Node(30);
     node.next.next.next=new Node(40); node.next.next.next.next=new Node(50);
     Node head=node;  Node temp=head;  
    System.out.println("Original List: ");     printList(head);  System.out.println();
     
     head = insertAtTail(head, 60);
     System.out.println(" \nList after inserting 60 at tail: ");  printList(head);
        
    Node emptyHead = null;    emptyHead = insertAtTail(emptyHead, 99);System.out.println();
    System.out.println("\nEmpty List after inserting 99 at tail: ");
     printList(emptyHead);
            
    }
    public static Node insertAtTail(Node head,int val){
            Node newNode=new Node(val);            if(head==null){ return newNode;}//edge case
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
           temp.next=newNode;
           return head;
    }
    public static void printList(Node head){
        Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null" );    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
