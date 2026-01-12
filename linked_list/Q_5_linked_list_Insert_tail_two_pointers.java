package linked_list;

public class Q_5_linked_list_Insert_tail_two_pointers {
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        Node insertNode=new Node(60);


        Node curr=head;
        Node prev=null;

        while(curr!=null){
            prev=curr;
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

        System.out.println("Current is: " + curr); // null
        System.out.println("Previous is: " + prev.data); // 50

        if (prev != null) {
            prev.next = insertNode;
        }

            System.out.println("After 50 comes: " + head.next.next.next.next.next.data);

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
