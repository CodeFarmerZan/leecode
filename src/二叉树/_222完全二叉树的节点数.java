package 二叉树;

/**
 * @ClassName _222完全二叉树的节点数
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/29 21:40
 * Version 1.0
 **/
public class _222完全二叉树的节点数 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rightDeep = 0, leftDeep = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        while (left != null) {
            leftDeep++;
            left = left.left;
        }
        while (right != null) {
            rightDeep++;
            right = right.right;
        }
        if (rightDeep == leftDeep) {
            return (2 << (rightDeep)) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
