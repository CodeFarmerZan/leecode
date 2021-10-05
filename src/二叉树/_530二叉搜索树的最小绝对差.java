package 二叉树;

/**
 * @ClassName _530二叉搜索树的最小绝对差
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/26 21:15
 * Version 1.0
 **/
public class _530二叉搜索树的最小绝对差 {
    int front = -1;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        travel(root);
        return min;
    }
    public void travel(TreeNode root){
        if(root == null){
            return ;
        }
        travel(root.left);
        if(front == -1){
            front = root.val;
        }else{
            min = Math.abs(root.val - front ) < min ? Math.abs(root.val - front ) : min;
            front = root.val;
        }
        travel(root.right);
    }
}
