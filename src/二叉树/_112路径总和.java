package 二叉树;

/**
 * @ClassName _112路径总和
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/4 21:37
 * Version 1.0
 **/
public class _112路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root != null){
            targetSum -= root.val;
            if(root.left == null && root.right == null && targetSum == 0){
                return true;
            }
            return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
        }
        return false;
    }
}
