package 二叉树;

import java.util.*;

/**
 * @ClassName _429N叉树的层序遍历
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 20:26
 * Version 1.0
 **/
/*
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class _429N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null){
            return lists;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Node node = root;
        queue.offer(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                Node poll = queue.poll();
                list.add(poll.val);
                for(Node child: poll.children){
                    queue.offer(child);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}

 */
