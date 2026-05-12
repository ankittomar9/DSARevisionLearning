package dsa_jan_revision.Tree;
public class Q_4_Are_given_Trees_Identical {
    public static void main(String[] args) {
           // Build the Tree: 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root1=new TreeNode(50);    root1.left=new TreeNode(30);
        root1.right=new TreeNode(70);       root1.left.left=new TreeNode(20);
        root1.left.right=new TreeNode(40);

        // Build the Tree Similar : 50(root), 30(L), 70(R), 20(LL), 40(LR)
        TreeNode root2=new TreeNode(50); root2.left=new TreeNode(30);
        root2.right=new TreeNode(70);    root2.left.left=new TreeNode(20);
        root2.left.right=new TreeNode(900);
        boolean result=isTreeIdentical(root1,root2);

        if(result==true){
            System.out.println("Trees are Identical");
         }else{
            System.out.println("Trees are Not identical");
         }
    }
    public static boolean isTreeIdentical(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){            return true;        }
        if(root1==null || root2==null){            return false;        }
        if(root1.data != root2.data){            return false;        }
        boolean leftSame=isTreeIdentical(root1.left,root2.left);
        boolean rightSame=isTreeIdentical(root1.right,root2.right);
        return leftSame && rightSame;
    }
    public static class TreeNode{
        int data;        TreeNode left;        TreeNode right;
            public TreeNode(int data){  this.data=data; this.left=null;   this.right=null;    }
    }
}

