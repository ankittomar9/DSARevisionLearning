package dsa_jan_revision.Tree;

import java.util.ArrayList;
import java.util.List;

public class Q_6_Tree_Traversal_In_Order {
    public static void main(String[] args) {
         //Build the Tree: 1(root), 2(L), 3(R), 4(LL), 5(LR) ,6(RL)
             TreeNode root=new TreeNode(1);
             root.left=new TreeNode(2);
             root.right=new TreeNode(3);
             root.left.left=new TreeNode(4);
             root.left.right=new TreeNode(5);
             root.right.left=new TreeNode(6);
                 
             System.out.println("Expected InOrder: [4, 2, 5, 1, 6, 3]");
             List<Integer> result = inOrderTraversal(root);
             System.out.println("Actual In-Order:   "+result);
    }
    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result =new ArrayList<>();
        if(root==null){return result;}
        inOrderHelper(root, result);
        return result;
    }
    public static void inOrderHelper(TreeNode root,List<Integer> result){
        if(root ==null){return ;}

        inOrderHelper(root.left,result);
        result.add(root.data);
        inOrderHelper(root.right,result); 
    }
   public static class TreeNode{
        int data;        TreeNode left;         TreeNode right;
        public TreeNode(int data){
            this.data=data;  this.left=null; this.right=null;       }    }
}
