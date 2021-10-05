package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _637二叉树的层平均值
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 20:17
 * Version 1.0
 **/
public class _637二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> list = new ArrayList<Double>();
        TreeNode node = root;
        if(root == null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                sum += poll.val;
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
            list.add(sum/size);
            //list.clear();
        }
        return list;
    }
}
