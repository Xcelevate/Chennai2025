package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice {
    public static void main(String[] args) {
        Queue<Sample<Integer>> queue = new PriorityQueue<>();


        queue.add(new Sample<>("Karthik", 32));
        queue.add(new Sample<>("sara", 91));
        queue.add(new Sample<>("harikrishnan", 63));
        queue.add(new Sample<>("welcome bro", 10));
        queue.add(new Sample<>("prasanth", 245));

        while (!queue.isEmpty()) {
            Sample<Integer> sample = queue.poll();
            System.out.println(sample);
        }

    }

    static class Sample<T extends Comparable<T>> implements Comparable<Sample<T>> {
        String name;
        T value;

        public Sample(String name, T value) {
            this.name = name;
            this.value = value;
        }

        public String toString() {
            return "name: " + this.name + ", value: " + this.value;
        }

        @Override
        public int compareTo(Sample<T> o) {
            return ((Integer) o.value).compareTo((Integer) this.value);
        }
    }
}

