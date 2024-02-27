package Arrays;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        /*
        Java array is an object which contains elements of a similar data type
        1.Array sizes doesn't grow i.e.
        2.we cannot add new values or delete values in an array.
          However, we can update values in the array
        3.all arrays are dynamically allocated.

        4.An array can contain primitives (int, char, etc.) and
        object (or non-primitive) references of a class depending
        on the definition of the array.
        In the case of primitive data types, the actual values
        might be stored in contiguous memory locations
        (JVM does not guarantee this behavior).
        In the case of class objects, the actual objects are
        stored in a heap segment.

        5. we can’t specify the size of array as long but we can specify it as int or short.
        6. An Object is direct superclass of an array in Java.
        7. Every array type implements the interfaces Cloneable and java.io.Serializable.
        8. The size of the array cannot be altered(once initialized).
           However, an array reference can be made to point to another array.

        */

    // 1. Initialization
        // Arrays with defined initial values and size is automatically decided
        int[] arr = {1,2,3,4,5};

        // Arrays with initial values as zero and size is given by user
        int[] arr2 = new int[5];
        // we can put [] both before and after the variable name.
        // [ ] : It is called subscript.
        int arr3[] = new int[1];
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        Integer[] arr1 = {1,2,2,2};

        /*
        The elements in the array allocated by new will automatically be
        initialized to zero (for numeric types), false (for boolean),
        or null (for reference types).
        */

    // 2. Iteration
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    // 3. Get value
        System.out.println(arr[2]);

    // 4. Update the value  -- set value
        arr[2] = 6;
        for (int i=0;i<=4;i++) {
            System.out.println(arr[i]);
        }

    // 5. size of the array
        System.out.println(arr.length);

    // 6. Clone
        /* deep copy is created for 1D array
        shallow copy is created for 2D array on using clone.
        */
        int[] arr_cpy = arr.clone();
        System.out.println(arr_cpy==arr);

    // 6. to get the class of the array
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());
        Class c=arr.getClass();
        String name=c.getName();
        /*
        The string “[I” is the run-time type signature for the class object “array with component type int.”
        The only direct superclass of an array type is java.lang.Object.
        The string “[B” is the run-time type signature for the class object “array with component type byte.”
        The string “[S” is the run-time type signature for the class object “array with component type short.”
        The string “[L” is the run-time type signature for the class object “array with component type of a Class.”
        The Class name is then followed.
         */

    // 7. Anonymous array
    //  printArray(new int[]{10,22,44,66});//passing anonymous array to method

    /* 8. Jagged Array in Java
        we had fixed number of columns, and each subarray or row of the two-dimensional array had the same number of elements.
        Java provides a concept of Jagged Arrays where a two-dimensional array can have sub-arrays of different sizes.
        It can have empty sub-arrays as well

     */
        int arr_2[][] = new int[3][];
        arr_2[0] = new int[3];
        arr_2[1] = new int[4];
        arr_2[2] = new int[2];

        for ( int[] i:arr_2){
            for ( int j: i){
            System.out.println(j);
            }
        }


    }
}
