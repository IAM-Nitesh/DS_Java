package Stacks;
import java.util.*;

public class Intro {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // view top element
        System.out.println(st.peek());

        // remove
        System.out.println(st.pop());

        // size
        System.out.println(st.size());
    }
}
