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
    List<Integer> lst = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        List<Queue<Integer>>  res = level(root);
        for(Queue<Integer> q : res){
            for(int n : q){
                lst.add(n);
                break;
            }
        }
        return lst;
    }
    public List<Queue<Integer>> level(TreeNode root){
        List<Queue<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            Queue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0;i<n;i++){
                TreeNode cur = q.poll();
                pq.offer(cur.val);
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
            res.add(pq);
        }
        return res;
    }
}