package 二叉树;

/**
 * @ClassName _98验证二叉搜索树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/25 16:36
 * Version 1.0
 **/
public class _98验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long minValue, long maxValue) {
        if(root != null){
            if(root.val <= minValue || root.val >= maxValue){
                return false;
            }
            return isValid(root.left,minValue,root.val) && isValid(root.right,root.val,maxValue);
        }
        return true;
    }
}
