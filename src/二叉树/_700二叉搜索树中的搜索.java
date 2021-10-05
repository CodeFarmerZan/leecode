package 二叉树;

/**
 * @ClassName _700二叉搜索树中的搜索
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/24 22:04
 * Version 1.0
 **/
public class _700二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root != null){
            if(val > root.val){
                return searchBST(root.right,val);
            }else if(val < root.val){
                return searchBST(root.left,val);
            }else{
                return root;
            }
        }
        return null;
    }
}
