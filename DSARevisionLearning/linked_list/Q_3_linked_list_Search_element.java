package linked_list;

public class Q_3_linked_list_Search_element {
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        int target=30;
        //#Rule never move the Head for Traverse and other things
        // First connect and do the chaining properly
        Node temp=head;

        while(temp!=null){
            if(temp.data==target)
            System.out.println("element exist and Found : "+ temp.data);
        temp=temp.next;
        }
    
    }
   
    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
}
