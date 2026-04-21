package dsa_jan_revision.linked_list;

public class Q_1_Linked_List_Generation {
    public static void main(String args[]){
        // Nodes are  10 20 30 40 50 
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);
        node.next.next.next.next=new Node(50);

           System.out.println("Linked List Generation and Printing");
         System.out.print(node.data+ " -> ");
          System.out.print(node.next.data+ " -> ");
           System.out.print(node.next.next.data+ " -> ");
            System.out.print(node.next.next.next.data+ " -> ");
             System.out.print(node.next.next.next.next.data+ " -> ");
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
