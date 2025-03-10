package Graphs;
import java.util.*;
public class WeightedGraphImplementationWithAdjacencyMatrix {
    static final int V=5;
    static final int AM[][]=new int[V][V];
    public static void addEdge(int src,int dst,int wt){
        AM[src][dst]=wt;
        AM[dst][src]=wt;//for undirectional graph
    }
    public static void printAdjacencyMatrix(int arr[][]){
        int i,j;
        for(i=0;i<V;i++){
            for(j=0;j<V;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        addEdge(0, 1,1);
        addEdge(0, 2,2);
        addEdge(0, 3,5);
        addEdge(1, 4,3);
        addEdge(1,3 ,9);
        addEdge(2, 3,8);
        addEdge(2, 4,6);
        addEdge(3, 4,7);
        addEdge(4, 0,4);
        printAdjacencyMatrix(AM);
    }
}
