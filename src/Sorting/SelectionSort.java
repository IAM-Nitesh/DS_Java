package Sorting;
import java.util.*;

public class SelectionSort {

    /* in an array of size N : arr[N]
    -> Consider the first element to be the min value in that array.
    -> then start iterating to through N length
    -> check if there is an element smaller than min val
    -> the above steps ends up finding us the smallest value in N length
    -> then swap the min_val with index i value
    -> repeat the entire process for entire N length

    */

    public static void main(String[] args) {

        int[] arr = {2,8,4,-1,7,10,5,6};
        sortit(arr);
    }

    static void sortit(int[] a){
        int i = 0;
        while (i<a.length){
            int min_val = a[i];
            int min_index = i;
            // finding smallest val and index in length N
           for (int j=i;j<a.length;j++){
               if (a[j] < min_val){
                   min_val = a[j];
                   min_index = j;
               }
           }
           // swapping with the current index i element
           int temp = a[i];
           a[i] = a[min_index];
           a[min_index] = temp;
           i+=1;
        }

        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);}

    }

}
