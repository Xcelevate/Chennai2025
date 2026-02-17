package stream;

import java.util.ArrayList;
import java.util.List;

public class Maximum {

    List<Integer> list;
    Maximum(){
        this.list = new ArrayList<>();
    }

    public static void main(String[] args){
        Maximum obj = new Maximum();
        obj.list.add(1);
        obj.list.add(2);
        obj.list.add(3);
        obj.list.add(4);
        obj.list.add(5);
        obj.list.add(6);
        obj.list.add(7);
        obj.list.add(8);

        System.out.println(obj.list.stream().count());
    }
}
