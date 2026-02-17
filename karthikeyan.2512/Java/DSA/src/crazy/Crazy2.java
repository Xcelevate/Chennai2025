package crazy;

public class Crazy2 {
    public static void main(String[] args) {
        var a = true;
        System.out.println(a);
        System.out.println(((Object) a).getClass().getName());
        var b =2 ;
        System.out.println(b);
        System.out.println(((Object) b).getClass().getSimpleName());
        var c ="Karthik" ;
        System.out.println(c);
        System.out.println(((Object) c).getClass().getModifiers());
    }
}
