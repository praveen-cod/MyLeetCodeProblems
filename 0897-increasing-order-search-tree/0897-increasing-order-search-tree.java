/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode res;
    public TreeNode increasingBST(TreeNode root) {
        List<Integer>lst = new ArrayList<>();
        inorder(root,lst);
        for(int n : lst){
            res = insert(res,n);
        }
        return res;
    }
    public TreeNode insert(TreeNode root,int data){
        if(root == null){
            return new TreeNode(data);
        }
        root.left = null;
        root.right = insert(root.right,data);
        return root;
    }
    void inorder(TreeNode root,List<Integer> lst){
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}