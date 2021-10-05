package 二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _113路径总和II
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/4 21:57
 * Version 1.0
 **/
public class _113路径总和II {
    /*List<List<Integer>> lists = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root != null){
            targetSum -= root.val;
            list.add(root.val);
            if(root.left == null && root.right == null && targetSum == 0){
                lists.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }else{
                pathSum(root.left,targetSum);
                pathSum(root.right,targetSum);
                list.remove(list.size() - 1);
            }
        }
        return lists;
    }*/
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return result;
        }
        path.add(root.val);
        traversal(root,targetSum-root.val);
        return result;
    }
    public void traversal(TreeNode cur,int count){
        if(cur.left==null && cur.right==null && count==0){
            result.add(path);
            return;
        }
        if(cur.left==null && cur.right==null && count!=0){
            return;
        }
        if(cur.left!=null){
            path.add(cur.left.val);
            count-=cur.left.val;
            traversal(cur.left,count);
            count+=cur.left.val;
            path.remove(path.size()-1);
        }
        if(cur.right!=null){
            path.add(cur.right.val);
            count-=cur.right.val;
            traversal(cur.right,count);
            count+=cur.right.val;
            path.remove(path.size()-1);
        }
        return;
    }

    public static void main(String[] args) {
        Deque<Integer> path = new LinkedList<Integer>();
        path.offerLast(1);
        path.offerLast(2);
        path.offerLast(3);
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        ret.add(new LinkedList<>(path));
        for(List l : ret){
            System.out.println(l);
        }

    }
}
