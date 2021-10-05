package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _111二叉树的最小深度
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/29 20:53
 * Version 1.0
 **/
public class _111二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int deep = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            deep++;
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                if(poll.left == null && poll.right == null){
                    return deep;
                }else{
                    if(poll.left != null){
                        queue.offer(poll.left);
                    }
                    if(poll.right != null){
                        queue.offer(poll.right);

                    }
                }

            }
        }
        return deep;
    }
}
