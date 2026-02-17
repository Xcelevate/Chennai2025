package Queue.priority;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Pair> lst = new ArrayList<>();
        lst.add(new Pair("Bob", 2));

        lst.add(new Pair("Alice", 1));
        lst.add(new Pair("Charlie", 3));
        lst.add(new Pair("Ethan", 5));

        lst.add(new Pair("Diana", 3));
        Comparator<Pair> com1 = (a, b) -> {
            if (a.name.compareTo(b.name) != 0)
                return b.name.compareTo(a.name);
            return Integer.compare(b.num, a.num);
        };
        Comparator<Pair> com2 = (a, b) -> {
            if (Integer.compare(a.num, b.num) != 0) return Integer.compare(b.num, a.num);
            return Integer.compare(b.name.length(), a.name.length());


        };
        Collections.sort(lst, com1 );
        for (Pair p : lst) {
            System.out.println(p);
        }
    }


    private static class Pair {
        int num;
        String name;

        Pair(String name, int num) {
            this.name = name;
            this.num = num;
        }

        public String toString() {
            return this.name + "  " + this.num;
        }
    }
}