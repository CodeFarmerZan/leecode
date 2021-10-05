package 二叉树;

/**
 * @ClassName _110平衡二叉树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/2 20:22
 * Version 1.0
 **/
public class _110平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(deep(root.left) - deep(root.right)) > 1){
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }
    public int deep(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDeep = deep(root.left);
        int rightDeep = deep(root.right);
        return Math.max(leftDeep,rightDeep) + 1;
    }
}
