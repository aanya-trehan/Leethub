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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map= new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int vertical=tuple.vertical;
            int level=tuple.level;
            
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.val);
            if(node.left!=null) q.offer(new Tuple(node.left,vertical-1,level+1));
            if(node.right!=null) q.offer(new Tuple(node.right,vertical+1,level+1));
            
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> in: map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: in.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
}

class Tuple{
    TreeNode node;
    int vertical;
    int level;
    public Tuple(TreeNode _node, int _vertical, int _level){
        node=_node;
        vertical=_vertical;
        level=_level;
    }
}