package dsa_jan_revision.linked_list;
public class Q_20_Merge_Two_Sorted_Lists {
    public static void main(String args[]){
    Node l1=new Node(1);l1.next=new Node(2);l1.next.next=new Node(4);
    Node l2=new Node(1);l2.next=new Node(3);l2.next.next=new Node(4);
    System.out.print("List 1: \n"); printList(l1);System.out.print("List 2: \n"); printList(l2);
    
    System.out.println("\nMerging the lists...");Node merged = mergeTwoLists(l1, l2);
        System.out.println("Merged List: ");    printList(merged);
    }
    public static Node mergeTwoLists(Node list1,Node list2){
        Node dummy =new Node(0); Node tail=dummy;
        while(list1!=null && list2!=null){
            if(list1.data <= list2.data){
                tail.next=list1;
                list1 = list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1!=null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return dummy.next;
    }
public static void printList(Node head){
Node temp=head;while(temp!=null){System.out.print(temp.data+ " -> ");temp=temp.next;} 
System.out.println("null");}
 public static class Node{
int data;  Node next;      public Node(int data){ this.data=data; this.next=null;} } 
}
