package javaPrograms;

import java.util.*;

public class FCP022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(s.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            boolean aval = false;

            for (int j = 0; j < i; j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    aval = true;
                    break;
                }
            }

            if (!aval) {
                int freq = Collections.frequency(numbers, numbers.get(i));
                System.out.println(numbers.get(i) + " = " + freq);
            }
        }
    }
}
