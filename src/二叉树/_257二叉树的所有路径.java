package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _257二叉树的所有路径
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/2 21:26
 * Version 1.0
 **/
public class _257二叉树的所有路径 {
    /*public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPath(root,"",paths);
        return paths;
    }
    public void constructPath(TreeNode root, String s, List<String> paths) {
        if(root == null){
            return ;
        }
        StringBuffer path = new StringBuffer(s);
        path.append(root.val);
        if(root.left == null && root.right == null){
            paths.add(new String(path));
        }else {
            path.append("->");
            constructPath(root.left,path.toString(),paths);
            constructPath(root.right,path.toString(),paths);
        }
    }*/

}
