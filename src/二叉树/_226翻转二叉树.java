package 二叉树;

/**
 * @ClassName _226翻转二叉树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/19 21:17
 * Version 1.0
 **/
public class _226翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if(root == null){
            return;
        }else{
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        invert(root.left);
        invert(root.right);
    }
}
