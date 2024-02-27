package Arrays;
import java.util.*;

public class Subarray {
    public static void main(String[] args) {

        /*Print all the possible subarray*/

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // main logic

        for( int start =0;start<size; start++){
            for (int end = start; end<size; end ++){

                for( int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }

                System.out.println();
            }
        }
    }
}
