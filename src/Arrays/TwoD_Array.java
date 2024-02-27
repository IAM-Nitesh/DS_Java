package Arrays;
import java.util.*;

public class TwoD_Array {
    public static void main(String[] args) {

        // 1. Initialization
        int[][] arr = new int[4][3];
        int[][] arr2 = {{1,2,3,4},{4,3,2,1}};
        int[][] arr3;
        int[][] arr4 = new int[][]{};

        // 2. Traversal
        for (int i=0;i<arr.length;i++){
            for ( int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }

        // 3. Set
        arr[1][2] =1;

        // 4. Get
        System.out.println(arr[1][2]);

        // 5. row count
        System.out.println(arr.length);

        // 6. column count
        System.out.println(arr[0].length);



    }
}
