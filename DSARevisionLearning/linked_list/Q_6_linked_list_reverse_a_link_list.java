package linked_list;

public class Q_6_linked_list_reverse_a_link_list {
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Node curr=head;
        Node prev=null;

        while(curr!=null){
              Node forwardNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forwardNode;
        
        }
        head=prev;

        System.out.println("Reversed List: ");
        Node temp = head; // Start from the new head
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }



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
