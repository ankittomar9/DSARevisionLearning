package dsa_jan_revision.linked_list;

public class Q_11_Linked_list_Cycle_detection {
    public static void main(String args[]){
        /*LeetCode 141 (Easy/Medium)We need to check if a Linked List has a loop (a cycle).
        Normal List: 1 -> 2 -> 3 -> null (Ends) Cyclic List: 1 -> 2 -> 3 -> 2... (Infinite loop)  */
            Node head = new Node(10);head.next= new Node(20);head.next.next=new Node(30);
            head.next.next.next.next=new Node(40) ;
                  head.next.next.next.next.next=head.next; // connecting 20 to check cycle detection
    }
     public static class Node{
int data; Node next;  public Node(int data){  this.data=data; this.next=null;  }    }  }
