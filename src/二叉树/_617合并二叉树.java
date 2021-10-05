package 二叉树;

/**
 * @ClassName _617合并二叉树
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/24 21:09
 * Version 1.0
 **/
public class _617合并二叉树 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        if(root1 != null && root2 != null){
            root.val = root1.val + root2.val;
        }else if (root1 != null && root2 == null ){
            root.val = root1.val;
            return root1;
        }else if (root1 == null && root2 != null ){
            root.val = root2.val;
            return root2;
        }else{
            return null;
        }
        root.left = mergeTrees(root1.left,root2.left);
        root.right = mergeTrees(root1.right,root2.right);
        return root;
    }
}
