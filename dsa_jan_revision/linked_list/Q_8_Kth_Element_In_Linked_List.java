package dsa_jan_revision.linked_list;
public class Q_8_Kth_Element_In_Linked_List {
    public static void main(String args[]){
    Node head= new Node(10); head.next=new Node(20);head.next.next=new Node(30);
    head.next.next.next=new Node(40); head.next.next.next.next=new Node(50);
           System.out.println("Original List: "); printList(head);  System.out.println();

        System.out.println("Element at index(Position) 3: " + getKthElement(head, 3));
        System.out.println("Element at index(Position) 10: " + getKthElement(head, 10));
    }
    public static int getKthElement(Node head,int k){
        if(head==null || k<0) return -1;
        Node current=head;
        for(int i=0;i< k && current!=null ;i++){
            current=current.next;
        }
        if(current==null){
            return -1;
        }
        return current.data;
    }

    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static class Node{
        int data; Node next;
        public Node(int data){
            this.data=data;this.next=null;
        }
    }
}
