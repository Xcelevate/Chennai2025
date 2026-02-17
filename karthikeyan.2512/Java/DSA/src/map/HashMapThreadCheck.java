package map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapThreadCheck {

    private static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Writer1-" + i);
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Writer2-" + i);
            }
        });

        writer1.start();
        writer2.start();

        writer1.join();
        writer2.join();

        // Expected size = 2000
        System.out.println("Final size: " + map.size());

        // Print some values
        System.out.println("Sample: " + map.get(100) + ", " + map.get(1500));
    }


}