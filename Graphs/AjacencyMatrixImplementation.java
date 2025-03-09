package Graphs;
import java.util.*;
public class AjacencyMatrixImplementation {
    static final int V=5;
    static final int AM[][]=new int[V][V];
    public static void addEdge(int src,int dst){
        AM[src][dst]=1;
        AM[dst][src]=1;
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
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(1, 4);
        addEdge(1,3 );
        addEdge(2, 3);
        addEdge(2, 4);
        addEdge(3, 4);
        addEdge(4, 0);
        printAdjacencyMatrix(AM);
    }
}
