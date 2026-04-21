package dsa_jan_revision.linked_list;
public class Q_2_Traverse_Linked_List_using_loop {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);
        node.next.next.next.next=new Node(50);

        Node head=node;
        Node temp=head;
         System.out.println("Linked List Traversal : ");
        while(temp!=null){
              System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
