package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _501二叉搜索树中的众数
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/26 21:49
 * Version 1.0
 **/
public class _501二叉搜索树中的众数 {
    int base;
    int count = 0;
    int max;
    List<Integer> res = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] re = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            re[i] = res.get(i);
        }
        return re;
    }
    public void dfs(TreeNode root){
        if(root != null){
            dfs(root.left);
            fun(root.val);
            dfs(root.right);
        }
    }
    public void fun(int val){
        if(val == base){
            count++;
        }else {
            base = val;
            count=1;
        }
        if(count == max){
            res.add(val);
        }else if(count > max){
            max = count;
            res.clear();
            res.add(base);
        }
    }
}
