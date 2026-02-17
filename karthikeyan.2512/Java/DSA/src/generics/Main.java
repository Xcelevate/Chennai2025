package generics;

// A generic Box class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get()); // prints 100

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println(strBox.get()); // prints Hello Generics
    }
}
