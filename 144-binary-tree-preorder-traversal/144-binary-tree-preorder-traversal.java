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
         List<Integer> ans=new ArrayList<>();
         helper(root,ans);
         return ans;
     }
    
    public void helper(TreeNode root, List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.val);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    
    public List<Integer> preorderTraversal1(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            while(current != null){
                list.add(current.val);
                stack.push(current.right);
                current = current.left;
            }
            if(!stack.isEmpty()){
            current = stack.pop();
            }
        }
        return list;
    }
}