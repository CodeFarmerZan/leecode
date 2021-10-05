package 二叉树;

/**
 * @ClassName _236二叉树的最近公共祖先
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/28 21:40
 * Version 1.0
 **/
public class _236二叉树的最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(right != null && left != null){
            return root;
        }
        if(left != null){
            return left;
        }
        return right;
    }
}
