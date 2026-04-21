package dsa_jan_revision.linked_list;

public class Q_5_Insertion_At_Head_in_Linked_List {
    public static void main(String args[]){
      Node node=new Node(10);  node.next=new Node(20);node.next.next=new Node(30);
         node.next.next.next=new Node(40); node.next.next.next.next=new Node(50);
            Node head=node;
            Node temp=head;  

             System.out.print("Linked List Before Insertion At head \n");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null" +"\n");
            
            Node newNode=new Node(5);
            newNode.next=head;
            head=newNode;
            temp=head;// to run the loop
             System.out.print("Linked List after Insertion At head \n");
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");
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
