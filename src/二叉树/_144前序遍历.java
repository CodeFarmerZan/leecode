package 二叉树;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _144前序遍历
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/9 19:43
 * Version 1.0
 **/
public class _144前序遍历 {

    public static void main(String[] args) {
        String string = new String();
        ClassLoader classLoader = string.getClass().getClassLoader();
        System.out.println(classLoader);
    }

    /*递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
     */
    /*非递归
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
            while(node != null){
                list.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop().right;
        }
        return list;
    }

     */
}
