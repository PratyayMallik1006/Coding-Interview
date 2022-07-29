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
//BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int length=q.size();
            TreeNode currentNode=null;
            int count=0;
            while(count<length){
                currentNode = q.poll();
                if(currentNode.left!=null){
                q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                q.add(currentNode.right);
                }
                count++;
            }
            res.add(currentNode.val);
        }
        return res;
    }
}
