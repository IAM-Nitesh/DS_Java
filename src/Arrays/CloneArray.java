package Arrays;

public class CloneArray {

    public static void main(String[] args) {
        /*
        Java array implements the Cloneable interface, we can create
        the clone of the Java array. If we create the clone of a
        single-dimensional array, it creates the deep copy of the Java array.
        It means, it will copy the actual value.
        But, if we create the clone of a multidimensional array,
        it creates the shallow copy of the Java array which means it
        copies the references.
         */

        //cloning of one-dimensional arrays
        int intArray[] = { 1, 2, 3 };
        int cloneArray[] = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i] + " ");
        }


        /*
        Cloning Multidimensional Array in Java
        A clone of a multi-dimensional array (like Object[][])
        is a “shallow copy,” however, which is to say that it
        creates only a single new array with each element array
        a reference to an original element array, but subarrays are shared.
        */

        int intArray2[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray2[][] = intArray2.clone();

        // will print false
        System.out.println(intArray2 == cloneArray2);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray2[0] == cloneArray2[0]);
        System.out.println(intArray2[1] == cloneArray2[1]);
    }

}