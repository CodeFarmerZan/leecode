package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _107层序遍历_倒序
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 19:33
 * Version 1.0
 **/
public class _107层序遍历_倒序 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null){
            return lists;
        }
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
                list.add(poll.val);
            }
            lists.add(0,list);
        }
        return lists;
    }
}


