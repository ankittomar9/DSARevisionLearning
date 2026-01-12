package linked_list;

public class Q_4_linked_list_Insert_node_at_tail {
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        //Node to inserted 
        Node temp=head;
        Node insertNode=new Node(60);

        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        temp.next=insertNode; //Insert node at 50 temp.next is
         
         while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

       
        
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
