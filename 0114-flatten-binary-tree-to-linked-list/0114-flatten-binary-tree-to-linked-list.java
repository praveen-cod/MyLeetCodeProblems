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
    public void flatten(TreeNode root) {
        if(root == null)return;
        TreeNode cur = root;
        List<Integer> lst = new ArrayList<>();
        inorder(cur,lst);
        TreeNode temp = root;
        for(int i = 0;i<lst.size();i++){
            temp.val = lst.get(i);
            temp.left = null;
            if(i < lst.size()-1){
                temp.right = new TreeNode(lst.get(i+1));
                temp = temp.right;
            }
        }
    }
    public void inorder(TreeNode root,List<Integer>lst){
        if(root == null) return;
         lst.add(root.val);
        inorder(root.left,lst);
        inorder(root.right,lst);
    }
}