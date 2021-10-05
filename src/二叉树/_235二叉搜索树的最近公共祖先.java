package 二叉树;

/**
 * @ClassName _235二叉搜索树的最近公共祖先
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/29 18:57
 * Version 1.0
 **/
public class _235二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else{
                break;
            }
        }
        return root;
    }
}
