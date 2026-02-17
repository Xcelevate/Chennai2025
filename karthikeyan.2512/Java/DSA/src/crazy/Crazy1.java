package crazy;

import java.util.ArrayList;
import java.util.List;

public class Crazy1 {
    public static void main(String[] args) {
        List list = new ArrayList<>(){{
            add("karthik");
            add(34);
            add(true);
            add("karthik");
        }};
        http:
        list.forEach(System.out::println);
       // System.out.println(list.get(2));
    }
}
