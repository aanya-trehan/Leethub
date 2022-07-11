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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        findPaths(root,targetSum,new ArrayList<Integer>(),ans);
        return ans;
        
    }
    public void findPaths(TreeNode root, int sum, ArrayList<Integer> current,  List<List<Integer>> paths){
        if(root == null) return;
        current.add(root.val);
        if(sum == root.val && root.left == null && root.right == null)
                paths.add(new ArrayList<>(current));

        findPaths(root.left, sum - root.val, current, paths);
        findPaths(root.right, sum - root.val, current, paths);

        current.remove(current.size() - 1);
    }
}