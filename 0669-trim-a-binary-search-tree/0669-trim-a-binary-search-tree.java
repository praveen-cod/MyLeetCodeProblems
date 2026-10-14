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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode temp = root;
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        for(int n : lst){
            if(n < low) root = deleteNode(root,n);
            if(n > high) root = deleteNode(root,n);
        }
        return root;
    }
    TreeNode helper(TreeNode root){
        if(root.left == null) return root.right;
        if(root.right == null) return root.left;
        TreeNode temp = root.right;
        TreeNode last = findLast(root.left);
        last.right = temp;
        return root.left;
    }
    TreeNode findLast(TreeNode root){
        if(root.right == null) return root;
        return findLast(root.right);
    }
    TreeNode deleteNode(TreeNode root,int key){
        if(root == null) return null;
        if(root.val == key) return helper(root);
        TreeNode temp = root;
        while(root != null){
            if(root.val > key){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                }
                else root = root.left;
            }
            else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }
                else root = root.right;
            }
        }
        return temp;
    }
    public void inorder(TreeNode root,List<Integer>lst){
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}