public class StringPrac {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("karthik");
       // String a = new String(str.reverse());
        StringBuilder sb = new StringBuilder("karthik");
        System.out.println(str.replace(1, 2 ,"ee"));
        System.out.println(str);
        StringBuffer str2 = new StringBuffer("karthik");
       // str2.capacity();
        System.out.println(str2.capacity());


        String a = new String("karthik");
        a = a.intern();
        String b = "karthik";
        System.out.println(a == b);// true
        System.out.println(a.equals(b));
                                                            // here we are checking the string in string pool
                                                                //  literal means directly assigning the value
                                 //   another one using new key word which will present in string pool but not a literal
        String x = new String("karthik");
        String y = "karthik";
        System.out.println(x == y);  //false
        System.out.println(x.equals(y)); // true
        y = new String(y);
        System.out.println(x == y); // true
    }
}
