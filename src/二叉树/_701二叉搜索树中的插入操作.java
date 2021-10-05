package 二叉树;

/**
 * @ClassName _701二叉搜索树中的插入操作
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/30 20:15
 * Version 1.0
 **/
public class _701二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode cur = root;
        while(true){
            if(val < cur.val){
                if(cur.left == null){
                    cur.left = new TreeNode(val);
                    break;
                }else{
                    cur = cur.left;
                }
            }else if(val > cur.val){
                if(cur.right == null){
                    cur.right = new TreeNode(val);
                    break;
                }else{
                    cur = cur.right;
                }
            }
        }
        return root;
    }
}
