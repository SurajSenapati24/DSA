import java.util.*;
public class PascalTriangle {
    /*First variant : Given the row and col number print the element  */
    public static long printElementAtRowCol(int row, int col){
        long ans=1;
        for(int i=1;i<col;i++){
            ans=ans*(row-i);
            ans=ans/(i+1);
        }
        return ans;
        //T.C=O(N)
    }
    public static void printRow(int row){
        long ans=1;
        System.out.print(ans+" ");
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static List<Long> generateRow(int row){
        long ans=1;
        List<Long> ansRow=new ArrayList<>();
        ansRow.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public static List<List<Long>> optimalPascalTriangle(int n){
        List<List<Long>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Element at row 4 and col 2 is: "+printElementAtRowCol(4, 2));
        printRow(4);
        System.out.println(optimalPascalTriangle(5));
    }
}
