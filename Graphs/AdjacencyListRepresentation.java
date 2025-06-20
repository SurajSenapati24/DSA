import java.util.*;
public class AdjacencyListRepresentation {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj,int nodes){
        for(int i=1;i<=nodes;i++){
            System.out.print(i+"->");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int edges=6;
        int nodes=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=nodes;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        printAdjacencyList(adj, nodes);
    }
}

