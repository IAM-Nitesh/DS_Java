package ArrayList;
import java.util.*;

public class Intro {
    public static void main(String[] args) {

        /*
        1.Dynamic Array of objects which can be declared without
        defining the size at the time of declaration.
        2.Can not hold primitive data types.
        Hence, can be created only for objects like wrapper classes - Integer, String etc
        3. Removal from the end is quicker than from the start as
        there would be swapping of the elements involved.
        Hence, Always prefer removal from end for better performance.
        */

        // 1. Declaration
        ArrayList<Integer> arr = new ArrayList<>();

        // 2. Insert -- added at the end
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        // 2. Insert -- at a particular index
        arr.add(1,100);
        System.out.println(arr);

        // 3. Delete from arraylist
        arr.remove(2);
        System.out.println(arr);

        // 4. Get value
        System.out.println(arr.get(1));

        // 5. set value
        arr.set(0,101);
        System.out.println(arr);

        // 6. length of Dynamic array
        System.out.println(arr.size());

        /* 7. Printing content of dynamic array doesn't require
        iterating through it , rather just a system.out.print is enough
        */

    }


}
