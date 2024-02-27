package Sorting;
import java.util.*;

public class Intro {
    public static void main(String[] args) {

        int[] arr= {3,9,-1,0,4,1};
        Arrays.sort(arr);

        /* -> It uses double pivoted quick sort
        with best case -> O(NlogN)
        with worst case -> O(N^2)
        */
        for (int i:arr){
            System.out.println(i);
        }

        /* -> Since worse case is N^2
              Hence use Collections.sort() instead
              with worst case -> O(NlogN)
           -> Hence copy the content of array into array list
              perform sorting
              and convert it back to array
        */
        ArrayList<Integer> arr1 = new ArrayList<>();
        for( int i:arr){
            arr1.add(i);
        }

        Collections.sort(arr1);
        System.out.println(arr1);
    }
}
