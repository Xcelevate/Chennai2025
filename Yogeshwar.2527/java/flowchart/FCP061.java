package javaPrograms;

import java.util.*;

public class FCP061 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        for(int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;
            for(int j = 0; j < i; j++) {
                if(list.get(j).equals(list.get(i))) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if(!alreadyPrinted) {
                System.out.println(list.get(i) + " - " + Collections.frequency(list, list.get(i)));
            }
        }
    }
}
