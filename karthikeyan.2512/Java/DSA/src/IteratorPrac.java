import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IteratorPrac {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Aguyb");
        set.add("Banana");
        set.add("ugudygudi");
        set.add("njkgk");
        set.add("ffhjbff");
        set.add("manihib");

        Map<String, Integer> map = new HashMap<>();
        int i = 1 ;
        for (String value : set) {
            map.put(value, i *= 2);
        }

        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()){
            String key = itr.next();
            System.out.println(key + " : " + map.get(key));
        }
        // iterator reached end . so reinitialise if need to run
        // itr =  map.keySet().iterator();
        while(itr.hasNext())
            System.out.println(itr.next() + "  "  + map.get(itr.next()));

    }
}