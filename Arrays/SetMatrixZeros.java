import java.util.*;
public class SetMatrixZeros{
    //brute force approach
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
    public static void printMatrix(int matrix[][], int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m1[][]={{1,0,1},{1,1,1}};
        int m=m1[0].length;
        int n=m1.length;
        printMatrix(m1, n, m);
        brute(m1, n, m);
        printMatrix(m1, n, m);
    }
}