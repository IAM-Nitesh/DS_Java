package Arrays;
import java.util.*;

public class MaxInArray {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the array size :");

        // Read user input for array size
        int size = myObj.nextInt();

        // create a new array of that size
        int[] arr = new int[size];

        // set values in the array
        for (int i=0;i<size;i++){
            System.out.println("Enter the "+i+ " th value :");
            arr[i] = myObj.nextInt();
        }

        // print content of the array
        /*
        System.out.println("Contents of the array are:");

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */

        int max = Integer.MIN_VALUE;

        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);

    }

}
