package DynamicProgramming;
import java.util.*;

public class minPath {

    public static void main(String[] args) {
        int i=0;
        int j=0;
        int[][] matrix = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] min_sum = new int[matrix.length][matrix[0].length];
        System.out.println(topdown(matrix,min_sum,i,j));
    }

    static int topdown(int[][] matrix,int[][] min_sum, int i,int j){
        if (i>=matrix.length || j>=matrix[0].length){
            return Integer.MAX_VALUE;
        }

        if (i==matrix.length-1 && j==matrix[0].length-1){
            return matrix[i][j];
        }
        if (min_sum[i][j]!=0){
            return min_sum[i][j];
        }

        int rightside = topdown(matrix,min_sum,i,j+1);
        int leftside = topdown(matrix,min_sum,i+1,j);
        min_sum[i][j] = matrix[i][j]+ Math.min(rightside,leftside);
        return min_sum[i][j];
    }

}
