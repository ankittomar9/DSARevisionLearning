package dsa_3_day_spaced_revision.linked_list;
public class Q_1_implement_Linked_List_Input {
    public static void main(String agrs[]){
        Node node=new Node(4);
        node.next=new Node(1);
        node.next.next=new Node(-3);
        node.next.next.next=new Node(6);

        Node head=node;
        Node temp=head;

          System.out.print(node.data+ " -> ");
            System.out.print(node.next.data+ " -> ");
            System.out.print(node.next.next.data+ " -> ");
              System.out.print(node.next.next.next.data+ "  ");

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
