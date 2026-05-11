package dsa_jan_revision.Tree;

public class Q_2_Sum_of_All_Nodes {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(30);
        root.right=new TreeNode(70);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(40);

        System.out.println("Tree constructed.");
        System.out.println("Calculating Sum.");

        long result=sumOfAllTreeNodes(root);
       System.out.println("The sum of all the Nodes of tree is: " + result);
    }
    public static long sumOfAllTreeNodes(TreeNode root){
        if(root==null){ return 0;}
        long sumLeft=sumOfAllTreeNodes(root.left);
         long sumRight=sumOfAllTreeNodes(root.right);
         return root.data+sumLeft+sumRight;
    }
    public static class TreeNode{
        int data;        TreeNode left;        TreeNode right;
        public TreeNode(int data){
            this.data=data; this.left=null;            this.right=null; }    }
}
