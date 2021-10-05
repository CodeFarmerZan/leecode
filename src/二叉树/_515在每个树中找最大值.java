package 二叉树;

import javax.sql.PooledConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _515在每个树中找最大值
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 20:55
 * Version 1.0
 **/
public class _515在每个树中找最大值 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode node = root;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = queue.peek().val;
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                max = max < poll.val ? poll.val : max;
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
