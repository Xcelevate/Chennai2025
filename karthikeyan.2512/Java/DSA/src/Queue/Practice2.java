package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    public static void main(String[] args) {
        Queue<Stud<String>> queue = new LinkedList<>();
        queue.add(new Stud<>("grg",39));
        queue.add(new Stud<>("kaahti",42));
        queue.add(new Stud<>("ffwwgww",95));
        queue.add(new Stud<>("wgrwgwr",613));
        queue.add(new Stud<>("hthrdf",765));
        queue.add(new Stud<>("g35y3g",81));


        while (!queue.isEmpty()) {
           Stud<String> stud = queue.poll();
            System.out.println(stud);
        }
    }
    static class Stud<A> {
        A name;
        int age;
        public Stud(A name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return this.name.toString() + " " + this.age;
        }
    }
}
