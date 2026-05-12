package dsa_jan_revision.Tree;

public class Q_5_Tree_Traversal_Pre_Order {
    public static void main(String[] args) {
              //Build the Tree: 1(root), 2(L), 3(R), 4(LL), 5(LR) ,6(RL)
             TreeNode root=new TreeNode(1);
             root.left=new TreeNode(2);
             root.right=new TreeNode(3);
             root.left.left=new TreeNode(4);
             root.left.right=new TreeNode(5);
             root.right.left=new TreeNode(6);
             System.out.println("Expected Pre-Order: [1, 2, 4, 5, 3, 6]");
             System.out.println("Actual Pre-Order:   ");
             preOrderTraversal(root);
    }
    public static void preOrderTraversal(TreeNode root){
        // root left right Preorder  expected output  1 2 4 5 3 6
        if(root==null){return ;}
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
         preOrderTraversal(root.right);
    }
    public static class TreeNode{
        int data; TreeNode left; TreeNode right;
        public TreeNode(int data){
            this.data=data;this.left=null; this.right=null;
        }
    }
}
