package ArrayList;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        // 1. Declaration

        // a. ArrayList<>(): This constructor is the default one,
        //  it creates an empty ArrayList instance with default initial capacity i.e. 10.
        ArrayList<Integer> arr = new ArrayList<>();
        // b. ArrayList(int capacity): This constructor creates an
        //   empty ArrayList with initial capacity as mentioned by the user.
        List<Integer> arr_l = new ArrayList<>(50);
        // c. ArrayList(Collection list): This constructor creates an ArrayList and
        // stores the elements that are present in collection list.
        // Creating an ArrayList with the elements that are present in Collection list.

        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        List<String> arr_n = new ArrayList<>(list);


        // 2. Insert -- added at the end
//      // add(Object o): This method is used to directly add the specified element at the end of the ArrayList.
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        // 2. Insert -- at a particular index
        // add(int index, Object o): This method is used to insert the specified element in the array list at the specified index.
        arr.add(1,100);
        System.out.println(arr);

        // 3. Delete from arraylist
        // a. remove(int index) : This method is used to remove the element present at the specified index from the ArrayList.
        arr.remove(2);
        System.out.println(arr);
        // b. remove(Object o) : This method is used to directly remove the specified element from the ArrayList.
        arr_n.remove("foo");
        System.out.println(arr_n);

        // 4. Get value
        System.out.println(arr.get(1));

        // 5. set value
        arr.set(0,101);
        System.out.println(arr);

        // 6. length of Dynamic array
        System.out.println(arr.size());

        /* 7.a. Printing content of dynamic array doesn't require
        iterating through it , rather just a system.out.print is enough
        */
        System.out.println(arr);
        // 7.b. using for loop or for each

        /* 7.c. Using listIterator()
        An iterator is an object that enables a programmer to traverse through collections such as ArrayList, HashSet, etc.
        Syntax:
        public ListIterator<E> listIterator(): This method returns a list iterator over the elements in the ArrayList in proper sequence. The returned list iterator is fail-fast.
        */
        // Creating an object of ListIterator<Integer>
        ListIterator<Integer> iterator = arr.listIterator();

        System.out.println("Iterating over an ArrayList:");
        // returns true if there is next element in the ArrayList
        while (iterator.hasNext()) {
            // Printing the iterated value
            System.out.print(iterator.next() + " ");
        }
        // Fail-Fast iterators immediately throw ConcurrentModificationException
        // if there is structural modification of the collection.
        // Structural modification means adding, removing any element from collection
        // while a thread is iterating over that collection.


        // 8. Sort - We can sort an ArrayList using the sort() method of the Collection framework in Java.
        // sort() method doesn't return anything.
        // The implementation is iterative merge sort and takes O(n * log(n)).

        // Collections.sort(name_of_arrayList);




    }


}
