import java.util.*;
public class DFS {
    //Using recursion
    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj){
        boolean visited[]=new boolean[V];
        List<Integer> dfslist=new ArrayList<>();
        visited[0]=true;
        dfs(0, adj, visited, dfslist);
        return dfslist;
    }
    public static void dfs(int node, List<List<Integer>> adj, boolean visited[],List<Integer> dfsList){
        visited[node]=true;
        dfsList.add(node);
        for(int i: adj.get(node)){
            if(!visited[i]){
                dfs(i,adj,visited,dfsList);
            }
        }
    }
    public static void main(String[] args) {
        int v=8;
        List<List<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(2).add(6);
        adj.get(3).add(2);
        adj.get(3).add(7);
        adj.get(4).add(1);
        adj.get(5).add(1);
        adj.get(6).add(2);
        adj.get(6).add(7);
        adj.get(7).add(3);
        adj.get(7).add(6);
        List<Integer> bfsResult = dfsOfGraph(v, adj);
        System.out.println("BFS Traversal from node 0: " + bfsResult);
    }
}
