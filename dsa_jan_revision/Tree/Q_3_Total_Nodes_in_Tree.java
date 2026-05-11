package dsa_jan_revision.Tree;

public class Q_3_Total_Nodes_in_Tree {
    public static void main(String[] args) {
        // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root1=new TreeNode(50);    root1.left=new TreeNode(30);
        root1.right=new TreeNode(70);       root1.left.left=new TreeNode(20);
        root1.left.right=new TreeNode(40);

        // Build the Tree Similar : 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root2=new TreeNode(50); root2.left=new TreeNode(30);
        root2.right=new TreeNode(70);    root2.left.left=new TreeNode(20);
        root2.left.right=new TreeNode(40);



    }
    public static boolean isTreeIdentical(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
    }
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
            public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
}
