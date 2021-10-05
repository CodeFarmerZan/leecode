package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _100相同的树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/3 20:08
 * Version 1.0
 **/
public class _100相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while (!queue.isEmpty()){
            TreeNode poll_1 = queue.poll();
            TreeNode poll_2 = queue.poll();
            if(poll_1 == null && poll_2 == null){
                continue;
            }
            if(poll_1 == null || poll_2 == null || poll_1.val != poll_2.val){
                return false;
            }
            queue.offer(poll_1.right);
            queue.offer(poll_2.right);

            queue.offer(poll_1.left);
            queue.offer(poll_2.left);
        }
        return true;
    }
}
