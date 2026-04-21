package dsa_jan_revision.linked_list;

public class Q_4_Search_element_in_the_LinkedList {
   public static void main(String args[]){
        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=new Node(50);
         head1.next.next.next.next.next=new Node(60);
        int target=40;
      System.out.println("\nIs Target "+target+" in Linked List 1: \n"+findTarget(head1, target));
        Node head2=null;
    System.out.println("Is Target "+target+"in Linked List 2 (Empty): \n"+findTarget(head2, target));
    }
    public static boolean findTarget(Node head,int target){
        boolean isFound=false;     Node temp=head;
         System.out.println("Original Linked List");
        while(temp!=null){
            System.out.print(temp.data + " -> ");
                       if(temp.data==target){
                         return true;
                       }
            temp=temp.next;
        }
        return false;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;        }    }   }
