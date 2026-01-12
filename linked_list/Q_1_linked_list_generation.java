package linked_list;

public class Q_1_linked_list_generation {
    public static void main(String args[]){
        Node root=new Node(10);
        root.next=new Node(20);
        root.next.next=new Node(30);
        root.next.next.next=new Node(40);
        root.next.next.next.next=new Node(50);

        Node head=root;
        //which variables i should use here 
        // head node temp root 

        System.out.print(root.data+" -> ");
         System.out.print(root.next.data+" -> ");
          System.out.print(root.next.next.data+" -> ");
           System.out.print(root.next.next.next.data+" -> ");
              System.out.print(root.next.next.next.next.data+" ");

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
