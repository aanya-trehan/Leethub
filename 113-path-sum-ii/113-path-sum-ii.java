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
        int[] count=new int[1];
        List<List<Integer>> ans=new ArrayList<>();
        findPaths(root,targetSum,new ArrayList<Integer>(),ans,count);
        return ans; 
    }
    public void findPaths(TreeNode root, int sum, ArrayList<Integer> current, List<List<Integer>> paths,int[] count){
        if(root == null) return;
        current.add(root.val);
        if(sum == root.val && root.left == null && root.right == null){
            paths.add(new ArrayList<>(current));
            count[0]++;
        }
        findPaths(root.left, sum - root.val, current, paths,count);
        findPaths(root.right, sum - root.val, current, paths,count);
        current.remove(current.size() - 1);
    }
}