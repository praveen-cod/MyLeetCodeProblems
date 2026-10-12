/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while(head != null){
            lst.add(head.val);
            head = head.next;
        }
        return insert(lst,0,lst.size()-1);
    }
    TreeNode insert(List<Integer> lst ,int left,int right){
        while(left > right) return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(lst.get(mid));
        root.left = insert(lst,left,mid-1);
        root.right = insert(lst,mid+1,right);
        return root;
    }
}