package 二叉树;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _101对称二叉树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/19 21:37
 * Version 1.0
 **/
public class _101对称二叉树 {
    /*
    public boolean isSymmetric(TreeNode root) {//递归法
        return symmetric(root.left,root.right);
    }

    private boolean symmetric(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && symmetric(p.left, q.right) && symmetric(p.right, q.left);
    }
 */
    public boolean isSymmetric(TreeNode root) {//迭代法
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()){
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if(p == null && q == null){
                continue;
            }
            if((p == null || q == null) || p.val != q.val){
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);

            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }
}
