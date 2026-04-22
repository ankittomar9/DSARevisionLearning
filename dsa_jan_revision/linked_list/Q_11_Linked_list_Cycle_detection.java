package dsa_jan_revision.linked_list;

public class Q_11_Linked_list_Cycle_detection {
    public static void main(String args[]){
        /*LeetCode 141 (Easy/Medium)We need to check if a Linked List has a loop (a cycle).
        Normal List: 1 -> 2 -> 3 -> null (Ends) Cyclic List: 1 -> 2 -> 3 -> 2... (Infinite loop)  */
     Node head = new Node(10);head.next= new Node(20);head.next.next=new Node(30);        head.next.next.next.next=new Node(40) ;
                  head.next.next.next.next.next=head.next; // connecting 20 to check cycle detection
          System.out.println("Original List : "); printList(head);  System.out.println();
          boolean cycleFound=cycleDetectionHelper(head);
          if(cycleFound) {
            System.out.println("Cycle Detected! The loop exists.");
        } else {
            System.out.println("No Cycle. Linear List.");
        }
    }
    public static boolean cycleDetectionHelper(Node head){
        Node slow= head; Node fast= head;
        boolean cycleFound=false;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return cycleFound=true; 
            }
        }
        return false;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" null ");
    }
     public static class Node{
int data; Node next;  public Node(int data){  this.data=data; this.next=null;  }    }  }
