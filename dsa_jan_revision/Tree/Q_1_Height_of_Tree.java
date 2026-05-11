package dsa_jan_revision.Tree;

public class Q_1_Height_of_Tree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(30);
        root.right=new TreeNode(70);
        root.left.left=new TreeNode(20);
        root.left.right=new  TreeNode(40);

        System.out.println("Tree constructed.");
        System.out.println("Calculating height...");
        
        int result = getHeight(root);
        System.out.println("The maximum height of the tree is: " + result);
    }
    public static int getHeight(TreeNode root){
        if(root==null){            return 0;        }

        int leftHeight=getHeight(root.left);
        int  rightHeight=getHeight(root.right);
        int result =Math.max(leftHeight, rightHeight)+1;
        return result;
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
