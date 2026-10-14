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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int ind  = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> lst = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode cur = q.poll();
                lst.add(cur.val);
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
            if(ind%2 != 0) Collections.reverse(lst);
            ind++;
            res.add(lst);
        }
        return res;
    }
}