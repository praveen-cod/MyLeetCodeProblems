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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<lst.size();i++){
            for(int j = i+1;j<lst.size();j++){
                min = Math.min(min,Math.abs(lst.get(i)-lst.get(j)));
            }
        }
        return min;
    }
    void inorder(TreeNode root,List<Integer> lst){
        if(root == null) return;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}