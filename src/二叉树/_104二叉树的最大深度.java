package 二叉树;

import org.junit.Test;

/**
 * @ClassName _104二叉树的最大深度
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/20 20:14
 * Version 1.0
 **/
public class _104二叉树的最大深度 {
    /*
    static int num = 0;
    static int max = 0;
    public int maxDepth(TreeNode root) {
        max(root);
        return max;
    }

    private void max(TreeNode root) {
        if(root == null){
            return ;
        }
        num = num + 1;
        max = num > max ? num : max;
        max(root.left);
        max(root.right);
        //遍历
        num = num - 1;
    }
     */
    static int num = 0;
    static int max = 0;
    public int maxDepth(TreeNode root) {
        if(root != null){
            num = num + 1;
            max = num > max ? num : max;
            maxDepth(root.left);
            maxDepth(root.right);
            //遍历
            num = num - 1;
        }
        return max;
    }

    private void max(TreeNode root) {
        if(root == null){
            return ;
        }
        num = num + 1;
        max = num > max ? num : max;
        max(root.left);
        max(root.right);
        //遍历
        num = num - 1;
    }
//    public int maxDepth(TreeNode root) {//递归
//        if(root == null){
//            return 0;
//        }
//        int leftHigh = maxDepth(root.left);
//        int rightHigh = maxDepth(root.right);
//        return Math.max(leftHigh,rightHigh) + 1;
//    }

    /*public static void main(String[] args) {
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1,null,right);
        System.out.println(maxDepth(root));
    }*/
}
