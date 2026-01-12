package linked_list;

public class Q_2_linked_list_traverse {
    public static void main(String args[]){
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);
        node.next.next.next.next=new Node(50);

        Node head=node;
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        // System.out.print(node.data +" -> ");
        //  System.out.print(node.next.data +" -> ");
        //   System.out.print(node.next.next.data +" -> ");
        //    System.out.print(node.next.next.next.data +" -> ");
        //     System.out.print(node.next.next.next.next.data +"  ");
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
