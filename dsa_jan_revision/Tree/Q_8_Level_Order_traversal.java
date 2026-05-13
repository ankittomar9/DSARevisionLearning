package dsa_jan_revision.Tree;
import java.util.LinkedList;
import java.util.Queue;
public class Q_8_Level_Order_traversal {
    public static void main(String[] args) {
         //Build the Tree: 1(root), 2(L), 3(R), 4(LL), 5(LR) ,6(RL), //7(RRL)
             TreeNode root=new TreeNode(1);   root.left=new TreeNode(2);
             root.right=new TreeNode(3); root.left.left=new TreeNode(4);
             root.left.right=new TreeNode(5); root.right.left=new TreeNode(6);
                //root.right.right.left=new TreeNode(7); this didn't work
                 
             System.out.println("Expected LevelOrder: [1,2,3,4,5,6]");
              System.out.println("Actual Level-Order:   "); leveOrderTraversal(root);
    }
    public static void leveOrderTraversal(TreeNode root){
        if(root==null){return;}
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            System.out.print(current.data+ " ");

            if(current.left!=null){
                queue.add(current.left);
            } 
            if(current.right!=null){
                queue.add(current.right);
              }
          }    }
    public static class TreeNode{
        int data;        TreeNode left;         TreeNode right;
        public TreeNode(int data){
            this.data=data;  this.left=null; this.right=null;       }    }
}
