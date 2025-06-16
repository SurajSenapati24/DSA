import java.util.*;
public class BFS {
    public static List<Integer> bfs(int V, List<List<Integer>> adj){
        List<Integer> bfsorder=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Arrays.fill(visited, false);
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfsorder.add(node);
            for(int i:adj.get(node)){
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return bfsorder;
    }
    public static void main(String[] args) {
        int v=5;
        List<List<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
        adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);
        List<Integer> bfsResult = bfs(v, adj);
        System.out.println("BFS Traversal from node 0: " + bfsResult);
        }
}
