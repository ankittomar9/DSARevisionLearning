package dsa_jan_revision.Tree;
import java.util.ArrayList;
import java.util.List;
public class Q_7_Tree_Traversal_Post_Order {
 public static void main(String[] args) {
     //Build the Tree: 1(root), 2(L), 3(R), 4(LL), 5(LR) ,6(RL)
             TreeNode root=new TreeNode(1);
             root.left=new TreeNode(2);
             root.right=new TreeNode(3);
             root.left.left=new TreeNode(4);
             root.left.right=new TreeNode(5);
             root.right.left=new TreeNode(6);
                 
             System.out.println("Expected PostOrder: [4, 5, 2, 6, 3, 1]");
             List<Integer> result = postOrderTraversal(root);
             System.out.println("Actual Post-Order:   "+result);
 }   
 public static List<Integer> postOrderTraversal(TreeNode root){
    List<Integer> result=new ArrayList<>();
          if(root==null){
           return result;
          }
          postOrderHelper(root,result);
             return result;
 }  
            public static void postOrderHelper(TreeNode root,List<Integer> result){
                if(root ==null ){return;}
                postOrderHelper(root.left,result);
                  postOrderHelper(root.right,result);
                  result.add(root.data);
            }
        public static class TreeNode{
        int data;        TreeNode left;         TreeNode right;
        public TreeNode(int data){
            this.data=data;  this.left=null; this.right=null;       }    }
}
