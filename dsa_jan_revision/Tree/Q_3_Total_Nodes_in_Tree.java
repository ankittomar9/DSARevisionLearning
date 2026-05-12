package dsa_jan_revision.Tree;

public class Q_3_Total_Nodes_in_Tree {
    public static void main(String[] args) {
       // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
            TreeNode root=new TreeNode(50);
            root.left=new TreeNode(30);
            root.right=new TreeNode(70);
            root.left.left=new TreeNode(20);
            root.left.right=new TreeNode(40);    

         System.out.println("Tree constructed.");
        System.out.println("Calculating nodes Count.");
            int result=NodesCounter(root);
            System.out.println("Total Nodes are : \n "+result);
    }
    public static int NodesCounter(TreeNode root){
        if(root==null ){return 0;}
        int leftCount=NodesCounter(root.left);
        int rightCount=NodesCounter(root.right);
        return leftCount+rightCount+1;
    }
     public static class TreeNode{
        int data;        TreeNode left;         TreeNode right;
        public TreeNode(int data){ this.data=data;    this.left=null;  this.right=null; }
    }

}
