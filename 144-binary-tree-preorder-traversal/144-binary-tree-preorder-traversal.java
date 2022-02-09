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

// two ways to solve this-> recursive approach and iterative approach
//for recurisve create a helper function and just recursively do list.add(current), call helper with current.left and then current.right

//iterative solution - stack 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        if (root == null)
        {
            return ans;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            ans.add(current.val);
            
            //we are pushing right value first and then left so that in next iteration left value is pops out first
            if (current.right != null)
            {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return ans;
    }
}