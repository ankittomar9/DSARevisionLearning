package dsa_jan_revision.linked_list;

public class Q_16_Partition_List {
    public static void main(String args[]){
        Node head =new Node(1);head.next=new Node(4);head.next.next=new Node(3);
        head.next.next.next=new Node(2);head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(2);
        System.out.println("Original List : "); printList(head);  
        int x=3;  System.out.println("Patitioned around x = : "+x );head=partition(head, x);
         System.out.println("Partition List : "); printList(head);  
    }
public static Node partition(Node head,int x){
    Node leftDummy=new Node(0);   Node rightDummy=new Node(0);
    Node leftTail=leftDummy;             Node rightTail=rightDummy;

    while(head !=null){
        if(head.data<x){
            leftTail.next=head;
            leftTail=leftTail.next;
        }else{
            rightTail.next=head;
            rightTail=rightTail.next;
        }
        head=head.next;
    }
     rightTail.next=null;
        leftTail.next=rightDummy.next;
        return leftDummy.next;
}
 public static void printList(Node head){
 Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
 System.out.println("null");}
 public static class Node{
         int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }
}
