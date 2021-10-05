package 二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _94中序遍历
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/10 20:27
 * Version 1.0
 **/
public class _94中序遍历 {
    /*
    public List<Integer> inorderTraversal(TreeNode root) {//栈
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }*/
/*    public List<Integer> inorderTraversal(TreeNode root) {//递归
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        inorder(root,res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }*/
}
