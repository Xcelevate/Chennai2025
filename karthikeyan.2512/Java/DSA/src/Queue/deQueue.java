package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class deQueue {
    public static void main(String[] args) {
        Deque<Integer> st = new LinkedList<>();   // valid
        Deque<Integer> st2 = new ArrayDeque<>();   // valid


        st.offerFirst(1);
        st.offerLast(2);
        st.addFirst(3);
        st.addLast(4);
//        st.pollFirst(); // poll()  , remove(); default removes first.
//        st.pollLast();
//        st.removeFirst();
//        st.removeLast();
        // st.reversed();
        //st.remove(2);
        System.out.println(st.peekLast());

        System.out.println(st);
    }
}
