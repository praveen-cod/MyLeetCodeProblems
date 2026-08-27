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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        helper(root,lst,0);
        return lst;
    }
    public void helper(TreeNode root,List<Integer>lst,int level){
        if(root == null) return;
        if(level == lst.size()) lst.add(root.val);
        helper(root.right,lst,level+1);
        helper(root.left,lst,level+1);
    }
}