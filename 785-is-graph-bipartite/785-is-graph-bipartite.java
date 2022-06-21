class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colours=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(colours[i]==0){
                // if(bfs(graph,colours,i)==false){
                //     return false;
                // }
            }
            if(dfs(graph,colours,i)==false){
                    return false;
                }
        }
        return true;
    }
    
    public boolean bfs(int[][] graph, int[] colour, int node){
        Queue<Integer> q=new LinkedList<Integer>();
        colour[node]=1;
        q.add(node);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int it:graph[curr]){
                if(colour[it]==0){
                    colour[it]=-colour[curr];
                    q.add(it);
                }
                else if(colour[it]!=-colour[curr]){
                    return false;
                }
            }
        }
        return true;
    }
    
     public boolean dfs(int[][] graph, int[] colour, int node){
         if(colour[node]==0)colour[node]=1;
         for(int it:graph[node]){
             if(colour[it]==0){
                 colour[it]=-colour[node];
                 if(!dfs(graph,colour,it)){
                     return false;
                 }
             }
             else if(colour[it]!=-colour[node]){
                 return false;
             }
         }
         return true;
     }
}