package Arrays;

public class ArrayUtilOps {

    public static void main(String[] args) {

        //Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting and searching arrays) in the java.util.Arrays class. For instance, the previous example can be modified to use the copyOfRange method of the java.util.Arrays class, as you can see in the ArrayCopyOfDemo example. The difference is that using the copyOfRange method does not require you to create the destination array before calling the method, because the destination array is returned by the method:

        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
        /*
        As you can see, the output from this program is the same, although it requires fewer lines of code. Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively, while the third parameter is the final index of the range to be copied, exclusively. In this example, the range to be copied does not include the array element at index 9 (which contains the string Lungo).
        Some other useful operations provided by methods in the java.util.Arrays class are:
            Searching an array for a specific value to get the index at which it is placed (the binarySearch method).
            Comparing two arrays to determine if they are equal or not (the equals method).
            Filling an array to place a specific value at each index (the fill method).
            Sorting an array into ascending order. This can be done either sequentially, using the sort method, or concurrently, using the parallelSort method introduced in Java SE 8. Parallel sorting of large arrays on multiprocessor systems is faster than sequential array sorting.
            Creating a stream that uses an array as its source (the stream method). For example, the following statement prints the contents of the copyTo array in the same way as in the previous example:

        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
        See Aggregate Operations for more information about streams.

        Converting an array to a string. The toString method converts each element of the array to a string, separates them with commas, then surrounds them with brackets. For example, the following statement converts the copyTo array to a string and prints it:
        */
        System.out.println(java.util.Arrays.toString(copyTo));

        // visit for more info
        // https://www.scaler.com/topics/java/arrays-class-in-java/
    }
}
