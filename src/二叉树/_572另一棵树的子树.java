package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _572另一棵树的子树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/3 20:33
 * Version 1.0
 **/
public class _572另一棵树的子树 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return def(root,subRoot);
    }
    public boolean def(TreeNode root,TreeNode subRoot){
        if(root != null){
            if(root.val == subRoot.val){
                if(isSameTree(root,subRoot) == true){
                    return true;
                }
            }
            return def(root.left,subRoot) || def(root.right,subRoot);
        }
        return false;
    }
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
