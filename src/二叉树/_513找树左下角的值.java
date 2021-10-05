package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _513找树左下角的值
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/4 20:40
 * Version 1.0
 **/
public class _513找树左下角的值 {
    public int findBottomLeftValue(TreeNode root) {
        int BottomLeftValue = 0;
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    TreeNode poll = queue.poll();
                    if(i == 0){
                        BottomLeftValue = poll.val;
                    }
                    if(poll.left!=null){
                        queue.offer(poll.left);
                    }
                    if(poll.right!=null){
                        queue.offer(poll.right);
                    }
                }
            }
        }
        return BottomLeftValue;
    }
}
