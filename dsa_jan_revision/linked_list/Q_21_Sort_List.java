package dsa_jan_revision.linked_list;

public class Q_21_Sort_List {
    public static void main(String args[]){
        Node head1=new Node(4); head1.next=new Node(2);head1.next.next=new Node(1);
        head1.next.next.next=new Node(3);

    }
public static void printList(Node head){
Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} }     
}
