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
//DFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,0,res);
        return res;
    }
    public void dfs(TreeNode node, int currentLevel, List<Integer> res){
        if(node == null) return;
        if(currentLevel >= res.size()){
            res.add(node.val);
        }
        if(node.right!=null){
            dfs(node.right, currentLevel+1,res);
        }
        if(node.left!=null){
            dfs(node.left,currentLevel+1,res);
        }
    }
    
}
