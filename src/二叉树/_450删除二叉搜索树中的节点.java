package 二叉树;

/**
 * @ClassName _450删除二叉搜索树中的节点
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/30 20:49
 * Version 1.0
 **/
public class _450删除二叉搜索树中的节点 {
    public int successor(TreeNode root){
        while (root.left != null){
            root = root.left;
        }
        return  root.val;
    }
    public int pre(TreeNode root){
        while (root.right != null){
            root = root.right;
        }
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
        if (key < root.val){
            root.left = deleteNode(root.left,key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else{
            if(root.right == null && root.left == null){
                root = null;
            }else if(root.right != null){
                root.val = successor(root.right);
                root.right = deleteNode(root.right,root.val);
            }else if(root.left != null){
                root.val = pre(root.left);
                root.left = deleteNode(root.left,root.val);
            }
        }
        return root;
    }
}
