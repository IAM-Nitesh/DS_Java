package Sorting;

public class BubbleSort {

    /* In an array of size N : arr[N]
    -> for each iteration we are going to find the largest number and push it to the end
    -> this can be done by comparing two adjacent elements -> J and J-1
    -> swap the larger number to current index J


    */

    public static void main(String[] args) {
        int[] arr = {4,6,8,3 ,9,-1,5,2};
        sortit(arr);
    }

    static void sortit(int[] a){

        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                // comparison of the two adjacent elements
                if (a[j]>a[j+1]){
                    // swapping
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for ( int i:a){
            System.out.println(i);
        }
    }
}
