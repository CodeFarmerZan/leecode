package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _199二叉树的右视图
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 20:08
 * Version 1.0
 **/
public class _199二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode node = root;
        if(root == null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                if(i == size - 1){
                    list.add(poll.val);
                }
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
        }
        return list;
    }
}
