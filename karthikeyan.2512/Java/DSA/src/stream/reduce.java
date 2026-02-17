package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream()
                .reduce(0, Integer:: sum);
        System.out.println(sum);

        long a = 6444L;
        long b = a;
        System.out.println(b);
        Set<Integer> evenList = list.stream().filter(x -> x% 2== 0).collect(Collectors.toSet());
        Set<Integer> distEvenList = list.stream().distinct().collect(Collectors.toSet());

        list.stream();
    }
}
