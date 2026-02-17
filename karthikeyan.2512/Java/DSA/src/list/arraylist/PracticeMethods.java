package list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeMethods {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");

        // Accessing elements
        System.out.println("First fruit: " + fruits.getFirst());

        Object o = "fsf";
        // Iterating


        // Checking size
       Collections.swap(fruits,1,1);
        System.out.println(Collections.emptyList());
        Collections.reverse(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
