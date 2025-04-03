import java.util.*;
public class SetMatrixZeros{
    //brute force approach
    //T.C=O(N^3)
    public static void brute(int matrix[][], int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markRows(matrix, i, m);
                    markCols(matrix, j, n);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void markRows(int matrix[][],int i,int m){
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    //for printing the matrix
    public static void markCols(int matrix[][],int j,int n){
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    //better approach
    //T.C=O(2xnxm)
    public static void better(int matrix[][],int n, int m){
        int rows[]=new int[n];
        int cols[]=new int[m];
        Arrays.fill(cols,0);
        Arrays.fill(rows, 0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void optimal(int matrix[][], int n, int m){
        
    }
    public static void printMatrix(int matrix[][], int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m1[][]={{1,0,1,0},{1,1,1,1},{1,1,1,0}};
        int m=m1[0].length;
        int n=m1.length;
        printMatrix(m1, n, m);
        better(m1, n, m);
        printMatrix(m1, n, m);
    }
}