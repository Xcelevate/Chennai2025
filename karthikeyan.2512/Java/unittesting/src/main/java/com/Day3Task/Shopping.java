package com.Day3Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shopping {
    private final List<String> items = new ArrayList<>();
    public void add(String item) {
        if (item == null || item.isBlank())
            throw new IllegalArgumentException();
        items.add(item);
    }

    public boolean remove(String item) {
        return items.remove(item);
    }

    public int size() {
        return items.size();
    }
   public List<String> items() { return Collections.unmodifiableList(items); }
}
