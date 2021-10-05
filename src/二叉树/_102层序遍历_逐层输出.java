package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _102层序遍历
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/17 21:50
 * Version 1.0
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class _102层序遍历_逐层输出 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        //List<Integer> list = new ArrayList<Integer>();
        TreeNode node = root;
        if(root == null)
            return lists;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();//必须每次new一个新的list，用clear移除全部不行！！！！！
                                                          //lists中每次放入的是一个对象，如果用clear移除会把之前放入lists中的list
                                                            //中的元素给移除掉，所以最后lists中的结果为空
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
            lists.add(list);
            //list.clear();
        }
        return lists;
    }
}
