package 二叉树;

/**
 * @ClassName _404左叶子之和
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/3 22:10
 * Version 1.0
 **/
public class _404左叶子之和 {
    int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        return check(root,0);
    }
    public int check(TreeNode root,int flag){//flag标志本节点是不是双亲结点的左结点
        if (root != null){
            if (root.left == null && root.right == null && flag == 1){
                count += root.val;
            }
            check(root.left,1);
            check(root.right,0);
        }
        return count;
    }
}
