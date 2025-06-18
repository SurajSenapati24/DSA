import java.util.*;
public class NumberOfProvinces {
    public static void dfs(int node, int[][] isConnected, boolean visited[]){
        visited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && !visited[i]){
                dfs(i, isConnected, visited);
            }
        }
    }
    public static int countNumberOfProvinces(int isConnected[][]){
        int n=isConnected.length;
        int count=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i, isConnected, visited);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] isConnected={{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Number of provinces are: "+countNumberOfProvinces(isConnected));
    }
}
