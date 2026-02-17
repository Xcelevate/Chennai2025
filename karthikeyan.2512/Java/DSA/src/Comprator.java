import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comprator {

    // sort according to the integer value using natural comparable

  /*  public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(61);
        list.add(12);
        list.add(39);
        list.add(40);
        list.add(15);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        Comparator< Integer > com = ( i,  j) -> i % 10 > j % 10 ? 1:-1;

        Collections.sort(list,com);
        System.out.println(list);
    }*/


    // soring according to the String length natural comparable

   /* public static void main(String[] args) {
        List <String> list = new ArrayList<>() ;
        list.add("Kfjsdf");
        list.add("jffkB");
        list.add("cf");
        list.add("Dflkeghifuef");
        list.add("fhjE");
        list.add("F");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list); // capital first priority then small letter.


        Comparator<String> com = new Comparator<String>(){
            public int compare(String a, String b){
                return a.length() > b.length() ?  1 : -1;
            }
        };
        Collections.sort(list,com);
        System.out.println(list);
    }*/


    //get a list by sorting a particular element in a object using comparator

    /*public static void main(String[] args) {
        List<Sstudent> p = new ArrayList<>();
        p.add(new Sstudent("Karthik", 21));
        p.add(new Sstudent("Hari", 19));
        p.add(new Sstudent("durga", 40));
        p.add(new Sstudent("kumar", 49));


        Comparator<Sstudent> com = (i, j) -> i.age < j.age ? -1 : 1;

        Collections.sort(p, com);
        for (Sstudent s : p) {
            System.out.println(s.tostring());
        }

    }

    static class Sstudent {
        String name;
        int age;


        Sstudent(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String tostring() {
            return "Student [ name : " + name + ", age : " + age + " ]";
        }
    }*/


    //implements the comparable usage

    /*public static void main(String[] args) {
        List<Sstudent> sr = new ArrayList<>();
        sr.add(new Sstudent("Karthik", 21));
        sr.add(new Sstudent("Hari", 19));
        sr.add(new Sstudent("durga", 40));
        sr.add(new Sstudent("kumar", 49));
        Collections.sort(sr);
        for (Sstudent r : sr) {
            System.out.println(r.tostring());
        }
    }
    static class Sstudent implements Comparable<Sstudent> {
        String name;
        int age;
        Sstudent() {
        }
        Sstudent(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String tostring() {
            return "Student [ name : " + name + ", age : " + age + " ]";
        }

        @Override
        public int compareTo(Sstudent o) {
            return Integer.compare(this.age, o.age);
        }
    }*/


    // implements the comparator usage

  /*  public static void main(String[] args) {
        List<Sstudent> sr = new ArrayList<>();
        sr.add(new Sstudent("Karthik", 21));
        sr.add(new Sstudent("Hari", 19));
        sr.add(new Sstudent("durga", 40));
        sr.add(new Sstudent("kumar", 49));
        Collections.sort(sr,new Sstudent());
        for (Sstudent r : sr) {
            System.out.println(r.tostring());
        }
    }
    class Sstudent implements Comparator<Sstudent> {

        String name;
        int age;


        Sstudent() {
        }
        Sstudent(String name , int age){
            this.name = name;
            this.age = age;
        }
        public String tostring() {
            return "Student [ name : " + name + ", age : " + age + " ]";
        }
        @Override
        public int compare(Sstudent i, Sstudent j) {
            return i.age >  j.age ? 1 : -1;
        }
    }  */

    // priorityqueue with comparator

  /*  public static void main(String[] args) {
        Comparator<Integer> com = ( i ,j) -> i > j ? 1 : -1;
        Queue<Integer> q1 = new PriorityQueue<>(com);
        q1.offer(19);
        q1.offer(32);
        q1.offer(30);
        q1.offer(94);
        q1.offer(58);
        q1.offer(61);
        int n = q1.size();

       // Collections.sort(q1);
        while(!q1.isEmpty()) {
            System.out.println(q1.poll());
        }
    }*/

    /*public static void main(String[] args) {
        List<Sstudent>list=new ArrayList<>();
        list.add(new Sstudent("karthi" , 25));
        list.add(new Sstudent("grhrt" , 65));
        list.add(new Sstudent("bfgb" , 876));
        list.add(new Sstudent("dhdg" , 234));
        list.add(new Sstudent("hth" , 60));

        Collections.sort(list , new AgeComparator());
        list.forEach(System.out::println);
    }*/
}
/*class AgeComparator implements Comparator {
    @Override
    public int compare(Object s1, Object s2) {
        if(s1 instanceof Sstudent s11 && s2 instanceof Sstudent s22){
            return s11.age < s22.age ? -1 :1;
        }
        return 0;
    }
    Comparator<Stud> sort_by_name = (i , j)-> i.name.compareTo(j.name);
}*/

// Sstudent class template

/*
class Sstudent {

    String name;
    int age;

    Sstudent() {
    }

    Sstudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [ name : " + name + ", age : " + age + " ]";
    }

}
class Stud {

    String name;
    int age;

    Stud() {
    }

    Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [ name : " + name + ", age : " + age + " ]";
    }

}

*/
