package Queue;
import java.util.*;

public class Intro {
    public static void main(String[] args) {

        Queue<Integer> qt = new ArrayDeque<>();

        // add
        qt.offer(10);
        qt.offer(20);
        qt.offer(30);
        qt.offer(40);

        // print front
        System.out.println(qt.peek());

        // len
        System.out.println(qt.size());

        // remove
        System.out.println(qt.remove());
    }
}
