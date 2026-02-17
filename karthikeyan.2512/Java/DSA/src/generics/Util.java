package generics;

public class Util {

    public static void main(String[] args) {
        Util2.print(123);       // Integer
        Util2.print("Karthi");  // String
        Util2.print(45.67);     // Double
    }
}

class Util2 {
    // Generic method
    public static <T> void print(T data) {
        System.out.println(data);
    }
}
