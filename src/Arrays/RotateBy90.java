package Arrays;
import java.util.*;

public class RotateBy90 {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        // transpose arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        // swapping
        for( int i=0;i< arr.length;i++) {  //
            for (int j = 0; j < arr.length / 2; j++) {
                // i = 0 to 3 and j = 0 and 1
                int temp = arr[i][j];  // 0,0 ; 0,1
                arr[i][j] = arr[i][arr.length - j - 1]; //0,3 ; 0,2
                arr[i][arr.length - j - 1] = temp;
                //System.out.println("at index: "+i+j+" value:"+arr[i][j]+" "+"at index: "+i+x+" value:"+arr[i][arr.length - i - 1]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
