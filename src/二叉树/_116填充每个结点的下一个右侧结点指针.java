package 二叉树;

import java.util.*;

/**
 * @ClassName _填充每个结点的下一个右侧结点指针
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/18 21:05
 * Version 1.0
 **/
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class _116填充每个结点的下一个右侧结点指针 {
    public Node connect(Node root) {//1 通过层次遍历（本代码采用的）2 使用已建立的next指针
                                    //对比此题和117题的next指针法
        if(root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Node node = root;
        queue.offer(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node poll = queue.poll();
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
                if(i == size - 1){
                    poll.next = null;
                    break;
                }
                poll.next = queue.peek();
            }
        }
        return root;
    }
}
