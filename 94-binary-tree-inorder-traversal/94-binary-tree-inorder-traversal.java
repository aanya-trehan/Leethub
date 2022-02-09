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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }
}

//similarly for post order
// while(!stack.isEmpty() || current != null){
//             while(current != null){
//                 list.add(current.val);
//                 stack.push(current);
//                 current = current.left;
//             }
//             current = stack.pop();
//             current = current.right;
//         }
//         return list;
//     }