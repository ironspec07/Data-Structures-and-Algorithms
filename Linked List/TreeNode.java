
//  * Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode flattenHelper(TreeNode root){
        if (root == null) {
            return null;
        }
        TreeNode l = flattenHelper(root.left);
        TreeNode r = flattenHelper(root.right);

        if (l==null && r==null) {
            return root;
        }
        else if (l==null && r!=null) {
            return r;
        }
        else if(l!=null && r==null) {
            TreeNode lc = root.left;
            root.right = lc;
            root.left = null;
            return l;
        }
        else{
            TreeNode lc = root.left;
            TreeNode rc = root.right;
            root.right = lc;
            root.left = null;
            l.right = rc;
            return r;
        }
    }
    public void flatten(TreeNode root) {
        flattenHelper(root);
    }
}