package dsa_jan_revision.linked_list;

public class Q_7_Insertion_At_a_Position_in_Linked_List {
    public static void main(String args[]){
    Node head= new Node(10); head.next=new Node(20);head.next.next=new Node(30);
    head.next.next.next=new Node(40); head.next.next.next.next=new Node(50);

         System.out.println("Original List: "); printList(head);  System.out.println();
        Node insertNode=new Node(35);
         int position=3;
        insertAtPosition(head,position,insertNode);
  System.out.println("After Insertion At in LinkedList: "); printList(head); 
  System.out.println();
      
    }
    public static Node insertAtPosition(Node head,int pos,Node insertNode){
          Node newNode=new Node(pos); if(pos==0){ newNode.next=head; return newNode;}//edge case
            Node current=head;

            for(int i=0;i<pos-1;i++){
                current=current.next;
            }
            insertNode.next=current.next;
            current.next=insertNode;
            current=head; 
          return head;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){       
            System.out.print(temp.data+" -> ");
            temp=temp.next;  
         }           System.out.print("null" );     }
         
    public static class Node{
        int data;  Node next;
        public Node(int data){
            this.data=data;
        }
    }
}
